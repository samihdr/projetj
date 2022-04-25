package com.exemple.demo.entites;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;
import lombok.Data;




@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString

public class Livre {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Column(length=50,nullable=false)
	private String titre;
	@Column(length=50,updatable=false,nullable=false)
	
	private String Med;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dsortie ;
	@Column(length=50,nullable=false)
	private String auteur ;
	@Column(length=50,nullable=false)
	private int  nbrpg;
	@Column(length=50,updatable=false,nullable=false)
	private String ISBN;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dconsu;
	private boolean disponibilite ;
	
	
	
	
	
	
}
