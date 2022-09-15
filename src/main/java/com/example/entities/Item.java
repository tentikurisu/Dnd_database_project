package com.example.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private int cost;
	@Column(nullable=false)
	private int dice;
	@Column(nullable=false)
	private String damagetype;
	@Column(nullable=false)
	private String propeties;
	
	public Item() {
		super();
	}
	
	public Item(String name, int cost, int dice, String damagetype, String propeties) {
		super();
		this.name = name;
		this.cost = cost;
		this.dice = dice;
		this.damagetype = damagetype;
		this.propeties = propeties;
	}
	
	public Item(long id, String name, int cost, int dice, String damagetype, String propeties) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.dice = dice;
		this.damagetype = damagetype;
		this.propeties = propeties;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDice() {
		return dice;
	}
	public void setDice(int dice) {
		this.dice = dice;
	}
	public String getDamagetype() {
		return damagetype;
	}
	public void setDamagetype(String damagetype) {
		this.damagetype = damagetype;
	}
	public String getPropeties() {
		return propeties;
	}
	public void setPropeties(String propeties) {
		this.propeties = propeties;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, damagetype, dice, name, propeties, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return cost == other.cost && Objects.equals(damagetype, other.damagetype) && dice == other.dice
				&& Objects.equals(name, other.name) && Objects.equals(propeties, other.propeties) && id == other.id;
	}
	
}
