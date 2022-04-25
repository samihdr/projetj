package com.exemple.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.entites.Livre;
import com.exemple.demo.repos.LivreRepo;

@RestController
@RequestMapping("/emsi-api")

public class LivreController {

	@Autowired
	private LivreRepo livreRepo;
	
	
	@GetMapping(path ="livres",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Livre> Livreliste(){return livreRepo.findAll();};
	
	
	@GetMapping( "livres/{id}")
	public Livre selection(@PathVariable Long id ) { return livreRepo.findById(id).get();}
	
	@PostMapping("/livres")
	public Livre ajouter(@RequestBody   Livre livre) {
		return livreRepo.save(livre);
	}
	
	@PutMapping("/livres/{id}")
	public  Livre modifier(@RequestBody  Livre livre ,@PathVariable Long id) {
	livre.setId(id);
		return livreRepo.save(livre);
	}
	
	@DeleteMapping("/livres/{id}")
	public void supprimer(@PathVariable Long id) {
		livreRepo.deleteById(id);
	}
	
}
 