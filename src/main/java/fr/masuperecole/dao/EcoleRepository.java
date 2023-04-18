package fr.masuperecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EcoleRepository  extends JpaRepository<Ecole, Long>{

	//Page<Ecole> findAll(Pageable pageable);

}
