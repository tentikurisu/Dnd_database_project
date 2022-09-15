package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.weapon;
import com.example.demo.entities.weapon;
import com.example.demo.repo.WeaponRepo;

@Service
public class Itemservice {
	private ItemRepo repo;
	public Itemservice(ItemRepo repo) {
		super();
		this.repo = repo;
	}
	

	
	
	public weapon create(weapon input) {
		return repo.saveAndFlush(input);
	}

	public List<weapon> getAll(){
		return repo.findAll();
	}
	public weapon getById(long id) {
		return repo.findById(id).get();
	}
	
	public weapon update(long id,weapon input) {
		weapon existing = repo.findById(id).get();
		
		existing.setName(input.getName());
		existing.setCost(input.getCost());
		existing.setDice(input.getDice());
		existing.setDamagetype(input.getDamagetype());
		existing.setPropeties(input.getPropeties());
		return repo.saveAndFlush(existing);
	}


	public boolean deleteweapon(long id) {
		repo.deleteById(id);
		return repo.existsById(id);
		
	}


	}