package Entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Planing  implements Serializable {
	
	private static final long serialVersionUID = 3876346912862238239L;
 
	@EmbeddedId
	private PlaningPK PlanningPK;
	
	//idMission est a la fois primary key et foreign key
	@ManyToOne
    @JoinColumn(name = "idFormation", referencedColumnName = "id", insertable=false, updatable=false)
	private Training training; 
	
	//idEmploye est a la fois primary key et foreign key
	@ManyToOne
    @JoinColumn(name = "idEmploye", referencedColumnName = "id", insertable=false, updatable=false)
	private Employee employe;
	
	private String status;
	

	
}