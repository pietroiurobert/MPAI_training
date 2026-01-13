/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepool;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import simplepool.domain.JDBCConnectionPool;

/**
 *
 * @author null
 */
public class SimplePool {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {

        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/repo_test",
                "test", "test");

        Connection con = pool.checkOut();

        DatabaseMetaData databaseMetaData = con.getMetaData();
        ResultSet rs = databaseMetaData.getTables(null, null, "%", null);
        while (rs.next()) {
            System.out.println(rs.getString(3));

        }

        pool.checkIn(con);

    }

}
