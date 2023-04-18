package fr.masuperecole.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Classroom {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nbEleves;
	@ManyToOne(fetch = FetchType.LAZY)
	private Ecole ecole;
	
	public Classroom() {

	}
	
	public Classroom(String name, int nbEleves) {
		super();
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
