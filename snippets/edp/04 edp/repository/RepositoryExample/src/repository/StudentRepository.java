/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entities.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author null
 */
public class StudentRepository implements IRepository<Student> {

    private String connectionString = "jdbc:derby://localhost:1527/repotest;create=true;user=test;password=test";
    private String driverName = "org.apache.derby.jdbc.ClientDriver";
    private Connection conn;

    public StudentRepository() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        conn = DriverManager.getConnection(connectionString);
    }

    public void close() throws SQLException {
        conn.close();
    }

    @Override
    public Student getById(int id) throws SQLException {
        PreparedStatement query = conn.prepareStatement("select * from app.students where student_id = ?");
        query.setInt(1, id);
        ResultSet results = query.executeQuery();
        if (results.next()) {
            return new Student(results
                    .getInt("student_id"), results.getString("first_name"), results.getString("last_name"));
        } else {
            return null;
        }
    }

    @Override
    public Collection<Student> findByDecription(String criteria) throws SQLException {
       Statement query = conn.createStatement();
        Collection<Student> students = new ArrayList<>();    
        ResultSet results = query.executeQuery(criteria);
        while (results.next()) {
            students.add(new Student(results
                    .getInt("student_id"), results.getString("first_name"),
                    results.getString("last_name")));
        }
        return students;
    }

    @Override
    public Collection<Student> findByFirstNameAndLastName(String first, String last) throws SQLException {
        PreparedStatement query = conn
                .prepareStatement("select * from app.students where first_name = ? and last_name = ?");
        Collection<Student> students = new ArrayList<>();
        query.setString(1, first);
        query.setString(2, last);
        ResultSet results = query.executeQuery();
        while (results.next()) {
            students.add(new Student(results
                    .getInt("student_id"), results.getString("first_name"),
                    results.getString("last_name")));
        }
        return students;
    }

    @Override
    public void add(Student student) throws SQLException {
        PreparedStatement query = conn
                .prepareStatement("insert into app.students (student_id, first_name,last_name) values (?,?,?)");
        query.setInt(1, student.getId());
        query.setString(2, student.getFirstName());
        query.setString(3, student.getLastName());
        query.executeUpdate();
    }

    @Override
    public void remove(Student student) throws SQLException {
        PreparedStatement query = conn
                .prepareStatement("delete from app.students where student_id == ? and"
                + " first_name == ? and last_name == ?");
        query.setInt(1, student.getId());
        query.setString(2, student.getFirstName());
        query.setString(3, student.getLastName());
        query.executeUpdate();
    }
}
