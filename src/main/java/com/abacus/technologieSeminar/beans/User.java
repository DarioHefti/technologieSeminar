/*
 * User.java
 *
 * Creator:
 * 05.09.2019 17:04 heftid
 *
 * Maintainer:
 * 05.09.2019 17:04 heftid
 *
 * Last Modification:
 * user: $
 *
 * Copyright (c) 2019 ABACUS Research AG, All Rights Reserved
 */
package com.abacus.technologieSeminar.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String surname;
  private byte[] pw;
//  @ManyToOne
//  private Adress adress;

  public User() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public byte[] getPw() {
    return pw;
  }

  public void setPw(byte[] pw) {
    this.pw = pw;
  }

//  public Adress getAdress() {
//    return adress;
//  }
//
//  public void setAdress(Adress adress) {
//    this.adress = adress;
//  }
}
