package monApp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * connection à la bdd
 */
public class MainApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");
    }
}
