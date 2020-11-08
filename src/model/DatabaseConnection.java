/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dimi44
 */
public class DatabaseConnection {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174904" ;
    static Connection dbConnection = null;
    static String     username = "it174904";
    static String     passwd = "dbtech";
    
    public static  Connection createConnection ()throws Exception {
    	try {
    		Class.forName (driverClassName);
    		dbConnection = DriverManager.getConnection (url, username, passwd);
    		System.out.print(dbConnection);
    		
    	
    	}catch (SQLException e){
    		e.printStackTrace();  
			System.err.println("connection failed "+e.getMessage());

    	}
    	return  dbConnection;
    }
   
}
