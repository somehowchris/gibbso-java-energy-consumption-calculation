/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.*;
import java.sql.*;

/**
 *
 * @author Nicola Temporal
 */
public class DBInterface {

    private static Connection c = null;

    public DBInterface() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (this.c == null) {
                this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/energiebev", "root", "root");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public ChainedList<EnergieData> LoadData() {
        ChainedList<EnergieData> al = new ChainedList<>();
        EnergieData o;
        try {
            Statement stmt = c.createStatement();
            String query = "select `jahr`, `energieform`, `betrag`, `bevch`, `bevaus` from enebev ";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                o = new EnergieData(rs.getInt("jahr"),rs.getInt("energieform"),rs.getInt("betrag"),rs.getInt("bevch"),rs.getInt("bevaus"));
                al.add(o);
            }
        } catch (SQLException e) {
            System.out.println(e);
            System.exit(0);
        }

        return al;
    }
}
