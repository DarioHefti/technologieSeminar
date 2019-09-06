/*
 * UserRepository.java
 *
 * Creator:
 * 05.09.2019 17:12 heftid
 *
 * Maintainer:
 * 05.09.2019 17:12 heftid
 *
 * Last Modification:
 * userRepository: $
 *
 * Copyright (c) 2019 ABACUS Research AG, All Rights Reserved
 */
package com.abacus.technologieSeminar.repositories;

import com.abacus.technologieSeminar.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface UserRepository extends JpaRepository<User,Long> {

  List<User> findBySurname(@Param("surname") String surname);

  List<User> findByName(@Param("name") String name);

}
