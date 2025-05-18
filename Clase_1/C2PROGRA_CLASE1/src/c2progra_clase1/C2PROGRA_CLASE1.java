/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2progra_clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class C2PROGRA_CLASE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // DECLARAMOS LAS VARIABLES 
        int variable1;
        String variable2;
        double variable3;
        long variable4=50;
        
        // lE ASIGNAMOS VALOR A LAS VARIABLESD DECLARADAS 
        
        variable1=1;
        variable2="esto es un string";
        variable3=1.5;
        
        // EBSEÑAMOS A NIVEL DE SISTEMA VARIABLES 
        
        System.out.println("hhshshdh");
        JOptionPane.showMessageDialog(null, "esto son los valores de variable" +"\n"+
                "variable2" + " "+ variable2+ "variable1"+ " " + variable1);
        
        String nuevaVariable=null; // no es lo mismo que String nuevaVariable=n" ";
        
        nuevaVariable = JOptionPane.showInputDialog(null, nuevaVariable); /* Esta Linea es un ejemplo de pedir 
        una variable en pantalla */
        
        JOptionPane.showInternalMessageDialog(null, nuevaVariable); // AQUI AL INSTANTE IMPRIMIMOS ESA VARIABLE EN PANTALLA
    }
    
}
