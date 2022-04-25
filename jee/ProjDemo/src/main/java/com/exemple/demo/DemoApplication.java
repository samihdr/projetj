package com.exemple.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exemple.demo.entites.Livre;
import com.exemple.demo.repos.LivreRepo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean
	CommandLineRunner start (LivreRepo livreRepo) {
		return args -> {
			livreRepo.save(new Livre(null,"au de la rue","madina",new Date(),"saouid",12,"isbn",new Date(),true));
			livreRepo.save(new Livre(null,"Aloha","dar salam",new Date(),"hiri",12,"isbn",new Date(),false));
		    livreRepo.save(new Livre(null,"OLAola","ain sbaa",new Date(),"sami",12,"bnis",new Date(),true));	
			livreRepo.save(new Livre(null,"lolu","derb sultan",new Date(),"salah",12,"bnis",new Date(),false));
			livreRepo.findAll().forEach(l->{
				System.out.println(l.toString());
			});
		};
		
	}
	
}
