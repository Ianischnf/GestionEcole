package fr.masuperecole;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masuperecole.dao.Ecole;
import fr.masuperecole.dao.Classroom;
import fr.masuperecole.dao.EcoleRepository;

import java.util.*;

 


@SpringBootApplication
public class GestionEcoleApplication implements CommandLineRunner {
	
	@Autowired  
	private EcoleRepository er;

	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Classroom> classes = new ArrayList<Classroom>();
		
		//Classroom classe1 = ;
		classes.add(new Classroom("Class 1", 20));

		er.save(new Ecole("Estiam", 10000, true, classes)); 
		er.save(new Ecole("Hetic", 64000, true, null)); 
		er.save(new Ecole("IPSSI", 2300, true, null)); 
		System.out.println("saved !");
		
		er.findAll().forEach(e->{ 
			System.out.println("Le nom de mon ecole est : " + e.getName()); 
			});

	}

}
