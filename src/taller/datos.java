//datos de la agenda
package taller;

import Interfaces.add_cita;
import javax.swing.JOptionPane;




public class datos {
    String turno="", cliente="",fecha_cita="", hora_cita="",tipo_tra= "",trabajo="",precio="";
    
    public void capturar_datos(){
        turno= add_cita.txt_turno.getText();
        cliente= add_cita.txt_cliente.getText();
       // fecha_cita=((JTextField)jc_date.)
       hora_cita=add_cita.Combo_hora.getSelectedItem().toString();
       tipo_tra=add_cita.Combo_tipos.getSelectedItem().toString();
       trabajo=add_cita.Combo_tra.getSelectedItem().toString();
       precio=add_cita.txt_precio.getText();
    }
    
    public void mostrar_datos(){
        JOptionPane.showMessageDialog(null, "Cita registrada\n"+
               "Turno: "+turno+"\n" 
            +"Cliente: "+cliente+"\n"
            +"Fecha Cita: "+fecha_cita+"\n"
            +"Hora Cita: "+hora_cita+"\n"
            +"Tipo de Trabajo: "+tipo_tra+"\n"
            +"Trabajo en especifico: "+trabajo+"\n"
            +"Precio: Q"+precio+"\n");
    }
}
