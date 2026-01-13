/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepersistence;

import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.javadb.annotations.exceptions.PersistenceException;
import persistence.javadb.managers.SimpleEntityManager;
import simplepersistence.entities.TestEntity;

/**
 *
 * @author null
 */
public class SimplePersistence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SimpleEntityManager em = SimpleEntityManager.getInstance();
        TestEntity test = new TestEntity(1,"name");
        try {
            em.persist(test);
        } catch (PersistenceException ex) {
            Logger.getLogger(SimplePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
