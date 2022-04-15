package hw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {

	@Id
	int matricola;
	
	@Column (nullable=false)
	String nome;
	
	@Column (nullable=false)
	String cognome;
	
	@Column (nullable=false)
	LocalDate dataNascita;
	
	@Column (nullable=false)
	String luogoNascita;
	
	@Column (nullable=false)
	String email;
	
	@ManyToOne
	@JoinColumn (name = "allievi")
	Societa societa;
	
	@ManyToMany (mappedBy = "allievi")
	List<Corso> corsi;
}
