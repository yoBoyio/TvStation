/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseConnection;

/**
 *
 * @author dimi44
 */
public class UserPageController {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
    static ResultSet resultsSet =null;
    
    public static int updatePass(String username,String newpassword,String oldpassword){
        int auth;
        try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select updatePass ( ?, ?, ?); ";
		
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,oldpassword);
                        preparedStatement.setString(3,newpassword);
			resultsSet=preparedStatement.executeQuery();
                        resultsSet.next();
                        
                         auth = resultsSet.getInt("updatepass");
           
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
                        auth=4;
		}
           
            return auth;
        
        
    }
    
}
    
