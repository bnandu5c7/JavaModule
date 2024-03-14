package school1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolUpdate {
    public static void main(String[] args) {
        System.out.println("update operation....");
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root","admin");
            PreparedStatement ps = con.prepareStatement("update emp_master set stream=? where sid=?");
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the id you want to update");
            int id=sc.nextInt();
            ps.setInt(2,id);
             Scanner sc1= new Scanner(System.in);
            System.out.println("enter the  new branch for the given id  ");
            String branch=sc1.nextLine();
            ps.setString(1,branch);
            int rowsupdated= ps.executeUpdate();
            ps.close();
            con.close();
                        
        }
        catch(SQLException e)
        {
            System.out.println("error in sql operations");
        }
        finally{
            System.out.println("record updated successfully");
        }
        
    }
    }
