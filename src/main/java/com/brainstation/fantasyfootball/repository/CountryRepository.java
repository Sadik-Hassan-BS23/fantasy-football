package com.brainstation.fantasyfootball.repository;

import com.brainstation.fantasyfootball.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * author: Sadik Hassan
 * created: 2:32 pm, 20/10/2022
 */
@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
