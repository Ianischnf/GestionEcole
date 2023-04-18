package fr.masuperecole.dao;

import java.util.List;


import jakarta.persistence.*;

@Entity
public class Ecole {
	
	@Id 
	@GeneratedValue
	
	private Long id; 
	private String name; 
	private double price; 
	private boolean status;	
	@OneToMany(mappedBy = "ecole", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Classroom> classes;
	
	
	public Ecole(String name, double price, boolean status) {
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

	public void setId(Long id) {
		this.id = id;
	}

	public List<Classroom> getClasses() {
		return classes;
	}

	public void setClasses(List<Classroom> classes) {
		this.classes.addAll(classes);
	}
	
	public void addClasse(Classroom classe) {
		this.classes.add(classe);
	}
	
}


