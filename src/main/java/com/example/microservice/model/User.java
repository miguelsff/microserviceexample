package com.example.microservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Table(name = "user_app")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	@Id
	private Integer id;
	private String name;
	private String email;
	
}
