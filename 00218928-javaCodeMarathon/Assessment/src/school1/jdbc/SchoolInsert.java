package school1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SchoolInsert {
    public static void main(String[] args) {
        System.out.println("insert operation....");
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root","admin");
            PreparedStatement ps = con.prepareStatement("insert into emp_master values(?,?,?,?,?)");
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the id you want to insert ");
            int id=sc.nextInt();
            ps.setInt(1,id);
             Scanner sc1= new Scanner(System.in);
            System.out.println("enter the name you want to insert ");
            String name=sc1.nextLine();
            ps.setString(2,name);
             Scanner sc2= new Scanner(System.in);
            System.out.println("enter the date of birth you want to insert ");
            String d=sc2.nextLine();
            ps.setString(3,d);
             Scanner sc3= new Scanner(System.in);
            System.out.println("enter the stream you want to insert ");
            String branch=sc3.nextLine();
            ps.setString(4,branch);
             Scanner sc4= new Scanner(System.in);
            System.out.println("enter the marks you want to insert ");
            int res=sc4.nextInt();
            ps.setInt(5,res);
            int rowsInserted = ps.executeUpdate();
            ps.close();
            con.close();
                        
        }
        catch(SQLException e)
        {
            System.out.println("error in sql operations");
        }
        finally{
            System.out.println("records are inserted successfully");
        }
        
    }
}
