package com.example.services;

import java.util.List;


import org.springframework.stereotype.Service;
import com.example.entities.Item;
import com.example.repo.ItemRepo;

@Service
public class Itemservice {
	private ItemRepo repo;
	public Itemservice(ItemRepo repo) {
		super();
		this.repo = repo;
	}
	

	
	
	public Item create(Item input) {
		return repo.saveAndFlush(input);
	}

	public List<Item> getAll(){
		return repo.findAll();
	}
	public Item getById(long id) {
		return repo.findById(id).get();
	}
	
	public Item update(long id,Item input) {
		Item existing = repo.findById(id).get();
		
		existing.setName(input.getName());
		existing.setCost(input.getCost());
		existing.setDice(input.getDice());
		existing.setDamagetype(input.getDamagetype());
		existing.setPropeties(input.getPropeties());
		return repo.saveAndFlush(existing);
	}


	public boolean deleteItem(long id) {
		repo.deleteById(id);
		return repo.existsById(id);
		
	}


	}