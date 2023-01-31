package com.example.springpostgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpostgres.entity.Fruit;
import com.example.springpostgres.service.FruitServ;


@RestController
public class FruitController {
	
	@Autowired
	public FruitServ fserv;


		@PostMapping("/fruitdata")
		public String savedata(@RequestBody Fruit f) {
			Fruit saved=fserv.savedata(f);
			return "saved sucessfully";
		}

		@GetMapping("/savedfruits")
		public ResponseEntity<List<Fruit>> savefruits(){
			List<Fruit> k=fserv.savefruits();
			return new ResponseEntity<List<Fruit>>(k,HttpStatus.CREATED);
		}
		
	}
