import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovelInsert {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root","admin");
            PreparedStatement p = c.prepareStatement("insert into novel values(?,?,?,?)");
            Scanner s = new Scanner(System.in);
            System.out.println("enter the novel id");
            int id = s.nextInt();
            p.setInt(1,id);
            Scanner s1 = new Scanner(System.in);
            System.out.println("enter the novel name ");
            String  name = s1.nextLine();
            p.setString(2,name);
            Scanner s2 = new Scanner(System.in);
            System.out.println("enter the novel price ");
            int cost = s2.nextInt();
            p.setInt(3,cost);
            Scanner s3= new Scanner(System.in);
            System.out.println("enter the novel pages ");
            int pages= s3.nextInt();
            p.setInt(4,pages);
            int rowinsert=p.executeUpdate();
            p.close();
            c.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}
