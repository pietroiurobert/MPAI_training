/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author null
 */
public interface IRepository<T> {

    T getById(int id) throws SQLException;

    Collection<T> findByDecription(String template) throws SQLException;

    Collection<T> findByFirstNameAndLastName(String first, String last) throws SQLException;

    void add(T product) throws SQLException;

    void remove(T product) throws SQLException;
}
