package fr.masuperecole.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Ecole {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id; 
	private String name; 
	private double price; 
	
	
	public Ecole( String name, double price, boolean status) {
		super();
		this.name = name;
		this.price = price;
		this.status = status;
	}
	
	public Ecole( ) {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	private boolean status;
	
}

