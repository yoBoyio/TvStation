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
public class PlayInfoController {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
    static ResultSet resultsSet =null;
    
    public static String [] getInfo(String movie){
        String infoTable[]=new String[100];
          try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select genre,title,year_prod,actor_name,actor_surname,actor_role,schedule_time,schedule_date,show_duration,schedule_id  from showInfo(?);";
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,movie);
			resultsSet=preparedStatement.executeQuery();
                        int n=0;
                        while (resultsSet.next()){
                        //get values
                         infoTable[0+n]= resultsSet.getString("title");
                         infoTable[1+n] = resultsSet.getString("genre");
                         infoTable[2+n] = String.valueOf(resultsSet.getInt("year_prod"));
                         infoTable[3+n] = resultsSet.getString("actor_name");
                         infoTable[4+n]  = resultsSet.getString("actor_surname");
                         infoTable[5+n]  = resultsSet.getString("actor_role");
                         infoTable[6+n] =resultsSet.getString("schedule_time");
                         infoTable[7+n] =resultsSet.getString("schedule_date");
                         infoTable[8+n] =resultsSet.getString("show_duration");
                         infoTable[9+n] =String.valueOf(resultsSet.getInt("schedule_id"));
                         n=n+10;
                        }
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
              		}
        return infoTable;
    }
    
    public static void addFavorites(String username, String title ){
            try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select addFavorites(?,?);";
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,title);
			resultsSet=preparedStatement.executeQuery(); 
                        
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
              	}
    }
    
    public static int checkFavorites(String username, String title ){
          int checkVal=3;
            try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select checkFavorites(?,?) as checkfavorites; ";
		try {
                        
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,title);
			resultsSet=preparedStatement.executeQuery();       
                        resultsSet.next();
                        //get values
                         checkVal= resultsSet.getInt("checkfavorites");
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
              	}
        return checkVal;
    }
    public static void deleteFavorites(String username, String title ){
            try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select deleteFavorites(?,?); ";
		try {
                        
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,title);
			resultsSet=preparedStatement.executeQuery();       
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
              	}
    }
}

