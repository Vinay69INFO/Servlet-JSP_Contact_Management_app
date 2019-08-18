
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Connection {
    private static Connection con;
    private static Statement st;
   public static Connection getConnection(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("======h1====== :");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_app_db","root","mysql");
            System.out.println(con+"=====h2======= :"+st);
       }catch(ClassNotFoundException e){
           System.out.println("Driver Class not found Exception");
           System.out.println(con+"=====h3======= :"+st);
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
            return con;
       
   }
    public static Statement getStatement(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("======1====== :");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_app_db","root","mysql");
            System.out.println(con+"=====2======= :"+st);
            st=con.createStatement();
            System.out.println(con+"======3====== :"+st);
        } catch (SQLException ex) {
            System.out.println(con+"=======4===== :"+st);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
       return st;
   }
   
}
