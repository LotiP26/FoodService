package com.cogent.fooddeliveryapp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "user")
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private Integer houseNumber;
	@NotBlank
	private String street;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String country;
	
	@NotNull
	private long zip;
	
	
	//one address can share many to one user
	@ManyToOne
	private User user; 
}
