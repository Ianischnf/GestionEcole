package dtos;

import java.util.List;


import jakarta.persistence.OneToMany;
import fr.masuperecole.dao.Classroom;

public class EcoleDto {
	
	private String name;
	private double price; 
	private boolean status;
	@OneToMany
	private List<Classroom> classes;
	
	
	public EcoleDto(String name, double price, boolean status, List<Classroom> classes) {
		this.name = name;
		this.price = price;
		this.status = status;
		this.classes = classes;
	}
	
	public EcoleDto() {
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
	
	public List<Classroom> getClasses() {
		return classes;
	}
	
	public void setClasses(Classroom classe) {
		this.classes.add(classe);
	}
	
	

}
