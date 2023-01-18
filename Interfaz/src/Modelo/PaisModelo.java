/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.AdmPais;
import java.sql.SQLException;

/**
 *
 * @author dnlal
 */
public class PaisModelo {
    public static boolean Register(String pais) throws ClassNotFoundException, SQLException{
        boolean flag;
        
        flag = "insertado".equals(AdmPais.registerPais(pais));
        return flag;
}
     public static boolean RemoveCountry(String pais) throws ClassNotFoundException, SQLException{
        boolean flag;
        
        flag = "borrado".equals(AdmPais.removeCountry(pais));
        return flag;
}
}
