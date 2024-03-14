package school1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolDelete {
     public static void main(String[] args) {
        System.out.println("delete  operation....");
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root","admin");
            PreparedStatement ps = con.prepareStatement("delete from emp_master where sname=?");
          
             Scanner sc1= new Scanner(System.in);
            System.out.println("enter the  name of the student to delete that record ");
            String name=sc1.nextLine();
            ps.setString(1,name);
            int rowsupdated= ps.executeUpdate();
            ps.close();
            con.close();
                        
        }
        catch(SQLException e)
        {
            System.out.println("error in sql operations");
        }
        finally{
            System.out.println("record deleted successfully");
        }
        
    }
}
