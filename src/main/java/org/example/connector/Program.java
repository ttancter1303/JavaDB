package org.example.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_36_37", "root", "");
            System.out.println("Connection Successful");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM student");
            while (rs.next()&&rs.getDate("birthday")!=null) {
                System.out.println("Id: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("full_name"));
                System.out.println("Birthday: " + rs.getDate("birthday"));
                System.out.println("Birthday: " + new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("birthday")));
                System.out.println("Country: " + rs.getString("country"));

            }

            con.close();
        }catch (Exception e) {
            System.out.println("Connexion Fail");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
