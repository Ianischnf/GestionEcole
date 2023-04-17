package dtos;

import java.util.List;

import fr.masuperecole.dao.Class;
import jakarta.persistence.OneToMany;

public class EcoleDto {
	
	private String name;
	private double price; 
	private boolean status;
	@OneToMany
	private List<Class> classes;
	
	
	public EcoleDto(String name, double price, boolean status) {
		this.name = name;
		this.price = price;
		this.status = status;
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
	
	
	
	
	

}
