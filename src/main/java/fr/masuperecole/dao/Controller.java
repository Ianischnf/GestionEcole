package fr.masuperecole.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dtos.EcoleDto;

@RestController

public class Controller {
	
	@Autowired
	private EcoleRepository er;
	
	@GetMapping("/ecoles")
		public List<Ecole> findAll(){
			return er.findAll();
	}
	
	@PostMapping("/ecoles")
	public Ecole addEcole(@RequestBody Ecole dto ) {

		Ecole ecole = new Ecole();
		ecole.setName(dto.getName()); 
		ecole.setPrice(dto.getPrice());
		ecole.setStatus(dto.isStatus());
		
		return er.save(ecole);
	}
	
	@DeleteMapping("/ecoles/{id}")
	public String deleteEcole(@PathVariable("id") Long id) {
	    Ecole ecole = er.findById(id).orElse(null);
	    if (ecole != null) {
	        er.deleteById(id);
	        return "Deleted";
	    } else {
	        return "Not found";
	    }
	}

	
	
}
