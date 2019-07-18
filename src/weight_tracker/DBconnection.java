
package weight_tracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jahadul-Rakib
 */
public class DBconnection {

    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost/weighttracker";
    public static final String user = "root";
    public static final String pass = "";
    
    public  Connection con = null;
    public  Statement statement =null;
    
    public DBconnection(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            statement = con.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
