/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.LoginHandler.con;
import static controller.LoginHandler.preparedStatement;
import static controller.LoginHandler.resultsSet;
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
public class RegisterHandler {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
    static ResultSet resultsSet =null;
    
    public static int authRegister(String name,String surname,String username,String password,String sex,String email){
        int auth;
        try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select signUP( ?, ?, ?, ? ,? , ?); ";
		
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
                        preparedStatement.setString(3,name);
			preparedStatement.setString(4,surname);
			preparedStatement.setString(5,sex);
                        //todo sex length database
			preparedStatement.setString(6,email);

			resultsSet=preparedStatement.executeQuery();
                        resultsSet.next();
                        //check if answer is not null
                         auth = resultsSet.getInt(1);
                        System.out.println(auth);
//			if(auth==1) {
//                       
//				authNum= 1;
//			}
//			else {
//                                authNum=  2;
//			}

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
                        auth=4;
		}
           
            return auth;
        
        
    }
    
}
