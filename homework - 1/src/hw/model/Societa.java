package hw.model;

import java.util.List;

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
	long telefono;
	
	//Ipotizzo che una società possa avere più allievi
	List<Allievo> allievi;
	
	@OneToOne (mappedBy = "societa", cascade = CascadeType.ALL)
	Indirizzo indirizzo;
}
