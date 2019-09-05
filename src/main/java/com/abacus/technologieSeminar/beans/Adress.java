/*
 * Adress.java
 *
 * Creator:
 * 05.09.2019 17:07 heftid
 *
 * Maintainer:
 * 05.09.2019 17:07 heftid
 *
 * Last Modification:
 * : $
 *
 * Copyright (c) 2019 ABACUS Research AG, All Rights Reserved
 */
package com.abacus.technologieSeminar.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Adress {

  @Id
  @GeneratedValue
  private long id;
//  @OneToMany(mappedBy = "id")
//  private Set<User> users = new TreeSet<>();
  private String street;
  private int houseNumber;
  private int postCode;
  private String city;

  public Adress() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

//  public Set<User> getUsers() {
//    return users;
//  }

//  public void setUsers(Set<User> users) {
//    this.users = users;
//  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  public int getPostCode() {
    return postCode;
  }

  public void setPostCode(int postCode) {
    this.postCode = postCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
