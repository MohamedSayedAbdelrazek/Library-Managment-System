/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP-VNBO47I
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb() {
        try {

<<<<<<< HEAD
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew","root","1230mody");
=======
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew","root","root");
>>>>>>> 16d5076467356d738398fe86d07533f9ce7dea13

            return conn;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
