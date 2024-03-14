package school1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolDisplay {
    public static void main(String[] args) {
        System.out.println("create operation..");
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root","admin");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from emp_master");
            while(rs.next())
            {
                System.out.println("the id of student is "+rs.getInt(1));
                System.out.println("the name  of student is "+rs.getString(2));
                System.out.println("the  date of birth of student is "+rs.getDate(3));
                System.out.println("the  stream of student is "+rs.getString(4));
                System.out.println("the marks of student is "+rs.getInt(5));
                System.out.println(".............");

            }
            rs.close();
            st.close();
            con.close();
                        
        }
        catch(SQLException e)
        {
            System.out.println("error in sql operations");
        }
        finally{
            System.out.println("records are displayed successfully");
        }
    }
}
