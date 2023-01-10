
package Modelo;

//

import Controlador.AdmLogin;
import java.sql.SQLException;

public class LoginModelo {
      
    
    //Retorna True or False (true=admin false=non admin, dependiendo del codigo de tipo de usuario)
    public static boolean Login(String user, String password) throws SQLException, ClassNotFoundException{
      
        String texto=AdmLogin.getProcedureLogin(user, password);
        
        return "ADMIN".equals(texto);
       
    }    
}


