import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovelDelete {

    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root", "admin");
            PreparedStatement p = c.prepareStatement("delete from novel where nid=?");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the id ypu want to delete");
            int id = sc.nextInt();
            p.setInt(1,id);
            int rowDel= p.executeUpdate();
            p.close();
            c.close();   
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}
