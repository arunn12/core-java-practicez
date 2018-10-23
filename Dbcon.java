package dbcon;

import java.sql.*;

public class Dbcon {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
            Statement stmt = con.createStatement();
            System.out.println("connected");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
