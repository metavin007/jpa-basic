
package th.co.geniustree.intership.jpa.basic;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static Object resultList;

    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-BASIC");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      
      em.getTransaction().commit();
    }
    
}
