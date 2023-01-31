package com.example.springpostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springpostgres.entity.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit,Integer>{


}
