//coneccion a la interfaz de acceso usuario
package taller;

import Interfaces.acceso_usuario;

public class Taller {
    /*@param args the command line arguments*/
    public static void main(String[] args) {
        acceso_usuario ingreso= new acceso_usuario();
        ingreso.setVisible(true);
    }
    
}
