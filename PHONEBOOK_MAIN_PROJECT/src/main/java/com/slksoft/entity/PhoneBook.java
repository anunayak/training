package com.slksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@Getter
@Setter
@ToString
public class PhoneBook {
 private Integer id;
 private String firstname;
 private String lastname;
 private String gender;
 private String email;
 private String phone;
 private String city;
 private String state;
 private String country;
 private String picture;
}
