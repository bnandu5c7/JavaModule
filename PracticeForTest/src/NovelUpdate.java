import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovelUpdate {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root", "admin");
            PreparedStatement p = c.prepareStatement("update novel set ntitle=?,nprice=? where nid=?");
            Scanner s = new Scanner(System.in);
            System.out.println(" enter the id of novel you want to update");
            int id=s.nextInt();
            p.setInt(3,id);
             Scanner s2 = new Scanner(System.in);
            System.out.println(" enter the name of novel");
            String name=s2.nextLine();
            p.setString(1,name);
             Scanner s3 = new Scanner(System.in);
            System.out.println(" enter the cost of novel ");
            int cost =s3.nextInt();
            p.setInt(2,cost);
            int rowsUpdate= p.executeUpdate();
            p.close();
            c.close();

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
