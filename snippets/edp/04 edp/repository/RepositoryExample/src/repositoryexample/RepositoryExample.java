/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoryexample;

import entities.Student;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import querybuilder.Condition;
import querybuilder.Select;
import repository.StudentRepository;

/**
 *
 * @author null
 */
public class RepositoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            StudentRepository repo = new StudentRepository();
            Student student1 = new Student(4, "ddd", "ddd");
            //repo.add(student1);
            Student student = repo.getById(4);
            System.out.println(student);
            Collection<Student> results = 
                    repo.findByDecription(
                        new Select("app.students")
                            .where(new Condition()
                                .equals("first_name", "'ccc'"))
                            .get());
            for (Student item : results) {
                System.out.println(item);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepositoryExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RepositoryExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
