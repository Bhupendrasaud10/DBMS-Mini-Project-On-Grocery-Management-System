package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jitendra mishra
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","admin");
            return con;
        }
        catch(Exception e) {
            return null;
        }
    }
    
    public static void main(String[] args) {
        ConnectionProvider conn = new ConnectionProvider();
    }
    
}
