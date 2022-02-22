package com.cogent.fooddeliveryapp.payload.request;


import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {

	@NotBlank
	private String email;
	@NotBlank
	private String password;
	@NotBlank
	private String name;
	@NotEmpty
	private Set<Address> address;
	@JsonFormat(pattern = "MM-dd-yyyy")
	private LocalDate doj;
	@NotEmpty
	private Set<String> roles;
}

/*
import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
	
	@NotBlank // specifically for string
	private String email;
	@NotBlank
	private String password;
	@NotBlank
	private String name;
	@NotEmpty // with collection
	private Set<Address> address;
	@JsonFormat(pattern = "MM-dd-yyyy") //interview question 
	private LocalDate doj; // localdate date of joining 
	@NotEmpty  // accepting in term of arrays 
	private Set<String> roles; // Creating accepting of User, accepting userRole specification

}
*/

//User Role , can have multiple roles 

//Admin Role
//Role Enum
//FoodType Enum
//Role DTO : role Id and Roleename(enum)
// reoo --> role 