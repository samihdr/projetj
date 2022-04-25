package com.exemple.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exemple.demo.entites.Livre;

@RepositoryRestResource

public interface LivreRepo extends JpaRepository<Livre,Long>{
	
	

}
