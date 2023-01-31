package com.example.springpostgres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fruit")
public class Fruit {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int price;
	String color;
	
	
	public Fruit(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	public Fruit() {
		super();
	}
	

	
}
