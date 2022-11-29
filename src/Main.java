import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main
{
    public static void main(String[] args)
    {
        Connection c=null;
        Statement stmt=null;
        try {
            Class.forName("oracle.jdbc.driver.oracleDriver");
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe", "System,'123456");
        }
        catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}