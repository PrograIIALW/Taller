
package taller;
//CONEXION A LA BASE DE DATOS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private String usuario= "root";
    private String contrasena="7777045914";
    private String BD_nom="bdinfo";
    private String host="BDTAller";
    
    private Connection conexion=null;
    
    private final String URL ="jdbc:mysql://"+host+":3306/"+BD_nom;
    
    public Conexion(){
}
    
    public Connection Conexion(){
        try {
            conexion = DriverManager.getConnection(URL, usuario, contrasena);
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectarse a la base de datos!! " + ex);
        }
        if (conexion != null) {
            System.out.println("Conectado a la base de datos....");
        }
        return conexion;
    }
    
    
}
