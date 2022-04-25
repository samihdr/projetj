package com.exemple.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.config.Projection;
import com.exemple.demo.entites.*;
public interface livreProjection extends CrudRepository<Livre, Long> {
	
	
	@Projection(
			  name = "livrep ", 
			  types = { Livre.class }) 
			public interface livrep {
			    
			   
			    
			  public   String gettitre();
			  public   String getdisponibilite();
			  public   String getdsortie();
			  public   String getnbrpg();
			    
			}

}
