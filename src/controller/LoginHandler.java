/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.PlayInfoController.con;
import static controller.PlayInfoController.resultsSet;
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


public class LoginHandler {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
    static ResultSet resultsSet =null;
       

    public  static String [] LoginAuth(String username,String password ){
        String userPin []=new String[6];
            try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql=" select user_username,user_password,user_name,user_surname,user_sex,user_email from accountlogin( ?, ?) AS answer; ";
		
		try {
                    
                    //todo protect password
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			resultsSet=preparedStatement.executeQuery();
                        resultsSet.next();
                        //check if answer is not null
                        //todo get results for every column
                        
                        userPin[0] = resultsSet.getString("user_username");
                        userPin[1] = resultsSet.getString("user_password");
                        userPin[2] = resultsSet.getString("user_name");
                        userPin[3] = resultsSet.getString("user_surname");
                        userPin[4] = resultsSet.getString("user_sex");
                        userPin[5] = resultsSet.getString("user_email");
                        
                        resultsSet.close();
                        con.close();

		} catch (SQLException e) {
			
			System.err.println(e.getMessage());
		}
           
            return userPin;
    }
    public static String setDetails(String answer){
        
        return answer;
    }
}
