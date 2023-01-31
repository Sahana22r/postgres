package com.example.springpostgres.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springpostgres.entity.Fruit;
import com.example.springpostgres.repository.FruitRepo;

@Service
public class FruitServImp implements FruitServ {
	
	@Autowired
	private FruitRepo repo;

	@Override
	public Fruit savedata(Fruit f) {
		 return repo.save(f);
		
	}
	public List< Fruit> savefruits(){
		return repo.findAll();
		
	}

}
