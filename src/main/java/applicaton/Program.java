package applicaton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		system.out.println("Teste 2");
		system.out.println("Teste 3");
		em.getTransaction().begin();
		em.remove(em.find(Person.class, 1));
		em.getTransaction().commit();
		System.out.println("Finished!");
		em.close();
		emf.close();
	}
}
