/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energieberechung.connector;

import java.sql.*;
import java.util.*;
import energieberechung.models.EnergieData;
/**
 *
 * @author chris
 */
public class DataBase {
    
    public static final int NOT_FOUND = -1;
    private static Connection c= null;
    
    public static void connectToDB() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(DataBase.c == null) DataBase.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/");
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    
    public static LinkedList<EnergieData> save(){
        LinkedList<EnergieData> dataset = new LinkedList<>();
        EnergieData data;
        DataBase.connectToDB();
        try{
            
        }catch(Exception e){
        }
    }
    
}
