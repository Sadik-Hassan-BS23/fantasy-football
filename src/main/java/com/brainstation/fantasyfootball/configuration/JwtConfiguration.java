package com.brainstation.fantasyfootball.configuration;

import com.brainstation.fantasyfootball.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Anupam Das
 * created date: 10/20/2022
 */

public class JwtConfiguration extends  onePerRequestFiler{

    @Autowired
    private UserService userService;
    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws
            ServletException, IOException {
        String requestToken = request.getHeader("Authorization");
        String jwtToken = null;
        String userName = null;

        if(requestToken!=null && requestToken.startsWith("Bearer")){
            jwtToken = requestToken.substring(7);
            try {
                userName = this.jwtUtil.extractUserName(jwtToken);

            }
            catch(Exception e){
                e.printStackTrace();
            }


            UserDetails userDetails = this.userService.loadUserByUserName(userName);
            if(userName!= null && SecurityContextHolder.getContext().getAuthentication()==null)
            {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }

    }

}