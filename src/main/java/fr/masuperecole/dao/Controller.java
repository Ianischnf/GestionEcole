package fr.masuperecole.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	
	private EcoleRepository er;
	
	@GetMapping("/findAll")
		public List<Ecole> findAll(){
			return er.findAll();
	}
}
