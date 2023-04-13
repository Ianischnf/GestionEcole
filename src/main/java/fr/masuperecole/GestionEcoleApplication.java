package fr.masuperecole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.masuperecole.dao.Ecole;
import fr.masuperecole.dao.EcoleRepository;

 


@SpringBootApplication
public class GestionEcoleApplication implements CommandLineRunner {
	
	@Autowired  
	private EcoleRepository er;

	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		er.save(new Ecole("Estiam", 10000, true)); 
		er.save(new Ecole("hetic", 64000, true)); 
		er.save(new Ecole("ipssi", 2300, true)); 
		System.out.println("saved !");
		
		er.findAll().forEach(e->{ 
			System.out.println("le nom de mon ecole est : " + e.getName()); 
			});

	}

}
