package com.nt.test.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

	private String name;
	private Long age;
	private String location;
	private String email;
	private String department;

}
