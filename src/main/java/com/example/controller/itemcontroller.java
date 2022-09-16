package com.example.controller;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Item;
import com.example.services.Itemservice;



@RestController
public class itemcontroller{
	private Itemservice service;
	public itemcontroller(Itemservice service) {
		super();
		this.service= service;
	}
	@PostMapping("/create")
	public Item createItem(@RequestBody Item input){
		return this.service.create(input);
	}
    @GetMapping("/getAll")
    public List<Item> getAll() {
        return this.service.getAll();
    }

    @PutMapping("/update")
    public Item updateItem(@PathVariable long id, @RequestBody Item input) {
    	return service.update(id, input);
    	}

    @DeleteMapping("/delete/{id}")
    public boolean deleteweapon(@PathVariable long id) {
        return this.service.deleteItem(id);
}}