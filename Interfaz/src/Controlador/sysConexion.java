
package Controlador;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


public class sysConexion {
    
    public static Connection obtConection(){
        
        try{
            String myDb="jdbc:oracle:thin:@localhost:1521:DBPRUEBA";
            String user="ge";
            String password="ge";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            java.sql.Connection connection= DriverManager.getConnection(myDb,user,password);
            return (Connection) connection;
            
        }   catch(SQLException e){
            System.out.println("El error es: "+ e);
            return null;
        }
        
    }
    
}
