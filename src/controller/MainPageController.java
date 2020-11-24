/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.PlayInfoController.con;
import static controller.PlayInfoController.preparedStatement;
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
public class MainPageController {
    static  Connection con =null;
    static PreparedStatement preparedStatement= null;
    static ResultSet resultsSet =null;
    
    public static String [] displayFavs(String movie){
        String displayTable[]=new String[50];
          try {
            con=DatabaseConnection.createConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select displayFavorites(?) as check; ";
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,movie);
			resultsSet=preparedStatement.executeQuery();
                        int n=0;
                        while (resultsSet.next()){
                        //get favorites
                         displayTable[n]= resultsSet.getString("check");
                         n=n+1;
                        }
                        resultsSet.close();
                        con.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
              		}
        return displayTable;
    }
    
}
