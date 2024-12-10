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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:9000/librarynew","root","root");
            return conn;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
