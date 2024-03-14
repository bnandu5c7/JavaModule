import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NovelDisplay {
    public static void main(String[] args) {
        try{
          DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/house", "root", "admin") ;
          Statement s = c.createStatement();
          ResultSet r=s.executeQuery("select * from novel");
          while(r.next())
          {
            System.out.println("the id of novel is "+r.getInt(1));
            System.out.println("the name of novel is "+r.getString(2));
            System.out.println("the cost  of novel is "+r.getInt(3));
            System.out.println("the pages  of novel is "+r.getInt(4));
            System.out.println(".................");

          }
          r.close();
          s.close();
          c.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
}
