
package test.user;

import connection.DB_Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TestConnection {
    public static void main(String[] args) {
        try{
        Statement st=DB_Connection.getConnection().createStatement();
        String sql="INSERT INTO "
                + "user (`name`, `phoneNo`, `emailId`, `address`, `userName`, `password`, `role`, `loginStatus`)"
                + " VALUES('Vinay', '4939405834', 'tiwari.vinay15@gmail.com', 'maruti nagar', 'vinay', '123',1,2)";
        st.executeUpdate(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
 
}
