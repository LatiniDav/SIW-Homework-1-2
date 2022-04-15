package hw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Indirizzo {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	
	@Column (nullable=false)
	String nomeVia;
	
	@Column (nullable=false)
	int civico;
	
	@Column (nullable=false)
	String comune;
	
	@Column (nullable=false)
	int cap;
	
	@Column (nullable=false)
	String provincia;
	
	//Suppongo che ad un  indirizzo vi possa essere una sola azienda
	@OneToOne
	Societa societa;
}
