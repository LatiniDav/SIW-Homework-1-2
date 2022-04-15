package hw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	
	@Column (nullable=false)
	String nome;
	
	@Column (nullable=false)
	String cognome;
	
	@Column (nullable=false)
	LocalDate dataNascita;
	
	@Column (nullable=false)
	String luogoNascita;
	
	@Column (nullable=false)
	long numeroIVA;
	
	@OneToMany (mappedBy = "docente" , fetch = FetchType.EAGER)
	List<Corso> corsi;
	
}
