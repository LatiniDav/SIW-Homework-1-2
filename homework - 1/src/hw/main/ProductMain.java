package hw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

////////COMMENTO//////////
//Poichè l'inidirizzo ha varie caratteristiche immagino che anche esso sia un'entità e considero
//un'associazione bidirezionale
//Considero che quando voglio vedere un docente mi interessano subito i suoi corsi
//Inoltre essendo necessario sapere sempre l'indirizzo di una società applico una cascade da Societa a Indirizzo
//////////////////////////



public class ProductMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("museum-unit");
		EntityManager em= emf.createEntityManager();
		em.close();
		emf.close();
	}
}
