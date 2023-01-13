
package Controlador;

import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


public class sysConnection {
    
    public static Connection obtConnection(){
        
        try{
            String myDb="jdbc:oracle:thin:@localhost:1521:BASES2023";
            String user="pr";
            String password="pr";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            java.sql.Connection connection= DriverManager.getConnection(myDb,user,password);
            return (Connection) connection;
        }   catch(SQLException e){
            System.out.println("El error es: "+ e);
            return null;
        }   
    }
}
