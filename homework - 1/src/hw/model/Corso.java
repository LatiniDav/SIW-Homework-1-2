package hw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Corso {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	int id;
	
	@Column (nullable=false)
	String nome;
	
	@Column (nullable=false)
	LocalDate dataInizio;
	
	@Column (nullable=false)
	int durataInMesi;
	
	@ManyToMany
	List<Allievo> allievi; 
	
	@ManyToOne
	Docente docente;
}
