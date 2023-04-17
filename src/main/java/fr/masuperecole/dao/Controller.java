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
	
	//lister les écoles
	@GetMapping("/ecoles")
		public List<Ecole> findAllEcoles(){
			return er.findAll();
	}
	
	//créer une école
	@PostMapping("/ecoles")
	public Ecole addEcole(@RequestBody Ecole dto ) {

		Ecole ecole = new Ecole();
		ecole.setName(dto.getName()); 
		ecole.setPrice(dto.getPrice());
		ecole.setStatus(dto.isStatus());
		
		return er.save(ecole);
	}
	
	//supprimer une école par id
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
	
	//lister les classes d'une école
	@GetMapping("/classes/{idEcole}")
	public List<Class> findAllClasses(@PathVariable("idEcole") Long id){
		Ecole ecole = er.findById(id).orElse(null);
		return ecole.getClasses();
	}
	
	//créer une classe
	@PostMapping("/classes/{idEcole}")
	public String addClass(@RequestBody Class dto, @PathVariable("idEcole") Long id) {
		Ecole ecole = er.findById(id).orElse(null);
		Class classe = new Class();
		classe.setName(dto.getName()); 
		classe.setNbEleves(dto.getNbEleves());
		ecole.setClasses(classe);
		return "Classe ajoutée";
	}

}
