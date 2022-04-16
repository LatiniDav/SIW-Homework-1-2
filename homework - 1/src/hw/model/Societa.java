package hw.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societa {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	
	@Column (nullable=false)
	String ragioneSociale;
	
	@Column (nullable=false)
	Long telefono;
	
	@OneToOne (mappedBy = "societa", cascade = CascadeType.ALL)
	Indirizzo indirizzo;
}
