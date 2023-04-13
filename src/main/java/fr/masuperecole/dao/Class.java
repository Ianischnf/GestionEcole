package fr.masuperecole.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Class {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nbEleves;
	
	
	
	
	public Class() {
		super();
	}

	
	public Class(Long id, String name, int nbEleves) {
		super();
		this.id = id;
		this.name = name;
		this.nbEleves = nbEleves;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbEleves() {
		return nbEleves;
	}
	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}
	public Long getId() {
		return id;
	}
	
	
	
	
	
	
	

}
