package com.brainstation.fantasyfootball.repository;

import com.brainstation.fantasyfootball.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Shahinur Beg
 * created date: 10/20/2022
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
