package fr.masuperecole.dao;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Ecole {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id; 
	private String name; 
	private double price; 
	private boolean status;	
	@OneToMany(mappedBy = "ecole", cascade = CascadeType.ALL);
	private List<Classroom> classes;
	
	
	public Ecole(String name, double price, boolean status, List<Classroom> classes) {
		super();
		this.name = name;
		this.price = price;
		this.status = status;
		this.classes = classes;
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

	public List<Classroom> getClasses() {
		return classes;
	}

	public void setClasses(Classroom classe) {
		this.classes.add(classe);
	}
	
}


