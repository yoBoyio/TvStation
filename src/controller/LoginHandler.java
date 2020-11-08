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


public class LoginHandler {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
   static ResultSet resultsSet =null;
       

    public  static int LoginAuth(String username,String password ){
        int authNum;
        
            try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select accountlogin( ?, ?) AS answer; ";
		
		try {
                    //todo protect password
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			resultsSet=preparedStatement.executeQuery();
                        resultsSet.next();
                        //check if answer is not null
                        String auth = resultsSet.getString("answer");

			if(auth!=null) {
				authNum= 1;
			}
			else {
                                authNum=  2;
			}

		} catch (SQLException e) {
			
			//statusLbl.setText(" lathos"+e);
			System.err.println(e.getMessage());
                        authNum=3;
		}
           
            return authNum;
    }
}
