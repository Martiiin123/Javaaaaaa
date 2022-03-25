
package clases;
import java.sql.*;
import javax.swing.JOptionPane;

public class Coneccion {
    
    //Coneccion Local
    public  static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_bs", "root", "");
            return cn;
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
        return null;
    }
}
