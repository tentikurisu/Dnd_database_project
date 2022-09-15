package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.weapon;

@RestController
public class Itemcontroller{
	public Itemservice service;
	public Itemcontroller(Itemservice service) {
		super();
		this.service= service;
	}
	@PostMapping("/create")
	public Items createItem @RequestBody Items Item){
		return this.service.create(Item);
	}
    @GetMapping("/getAll")
    public List<Items> getAllItem() {
        return this.service.getAll();
    }

    @PutMapping("/update")
    public Item updateItem(@PathVariable long id, @RequestBody Item input) {
    	return service.update(id, input);
    	}

    @DeleteMapping("/delete/{id}")
    public boolean deleteweapon(@PathVariable int id) {
        return this.service.deleteweapon(id);
}