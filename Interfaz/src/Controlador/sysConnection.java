
package Controlador;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


public class sysConnection {
    
    public static Connection obtConnection(){
        
        try{
            String myDb="jdbc:oracle:thin:@localhost:1521:BASES2023";

            String password="pr";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            java.sql.Connection connection= DriverManager.getConnection(myDb,user,password);
            return (Connection) connection;
        }   catch(SQLException e){


            String password="ge";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            java.sql.Connection connection= DriverManager.getConnection(myDb,user,password);
            return (Connection) connection;
        }catch(SQLException e){

            System.out.println("El error es: "+ e);
            return null;
        }   
    }

    public static ResultSet ejecutarStoredProcedure(CallableStatement cs) throws SQLException{
        return cs.executeQuery();
    }

}
