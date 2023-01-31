package com.example.springpostgres.service;

import java.util.List;

import com.example.springpostgres.entity.Fruit;

public interface FruitServ {
	Fruit savedata(Fruit f);
	public List<Fruit> savefruits();
}
