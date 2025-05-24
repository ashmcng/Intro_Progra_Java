/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Switch_Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /////Mensaje de bienvenida
        ///
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PROGRAMA QUE DETERMINA EL DIA DE LA SEMANA");
        
        //variables 
        
        int dia;
        String lectura1;

        // inicializamos 
        lectura1  = "";
        dia  = 0;

        // inicio programa
        lectura1  = JOptionPane.showInputDialog("Digite el numero de del dia de la semana"); // digita el dia de la semana

        dia  = Integer.parseInt(lectura1); // pasamos lectura a int dia 

        switch (dia) {

            case 1:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "El dia de la semana es Domingo");
                break;
        }
       
        if (dia !=6 && dia != 7){
            
             JOptionPane.showMessageDialog(null, "Es un dia laboral");
        } else { 
            JOptionPane.showMessageDialog(null, "No es un dia laboral");
        }

    
}
    
    
    
    
}

        
    

