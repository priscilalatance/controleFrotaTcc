package controleFrota;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;



public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		/*Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");		
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");*/
		Usuario usuario = new Usuario(null, "Priscila", "1458-2", 997142685, "47589635894", "Salvador correa, 76", "pri@gmail.com", "52695415", false);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-frota");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(usuario);
		//em.persist(p2);
		//em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		/*em.close();
		emf.close();*/

	}

}
