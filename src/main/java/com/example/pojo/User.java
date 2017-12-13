package com.example.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	private int id;
	private String name;
	private int age;
}
