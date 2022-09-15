package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long>{
	
}