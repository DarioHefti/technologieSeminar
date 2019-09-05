package com.abacus.technologieSeminar.repositories;/*
 * AdressRepository.java
 *
 * Creator:
 * 05.09.2019 17:12 heftid
 *
 * Maintainer:
 * 05.09.2019 17:12 heftid
 *
 * Last Modification:
 * adressRepository: $
 *
 * Copyright (c) 2019 ABACUS Research AG, All Rights Reserved
 */

import com.abacus.technologieSeminar.beans.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress,Long> {

}
