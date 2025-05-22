/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2_clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class C2_Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /// A • Escriba un nuevo programa en JAVAque le solicite al usuario su edad y le indique si puede o no puede votar.
         /// Considere que en nuestro país, solo las personas con
        /// 18 años o más pueden votar.
        ///
        // DEFINIMOS LAS VARIABLES 
        
        String Nombre;
        int edad; 
        String Lectura;
        
        //llenamos de 0 
        
        Nombre = " "; 
        edad = 0; 
        Lectura = " ";
        
        
        //Mensaje de bienvenida
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PROGRAMA QUE DETERMINA SI PUEDE VOTAR EN COSTA RICA");
        
        // pedimos usuario su informacion
        
        Nombre = JOptionPane.showInputDialog("Digite su nombre"); // pedimos usuario su nombre
        
        Lectura = JOptionPane.showInputDialog("Digite su edad"); //pedimos a usuario su edad
        
        edad = Integer.parseInt(Lectura); // Asignamos el valor de lectura a la edad
        
        
        // INICIO IF 
        
        
        if (edad >= 18 ){
            
            JOptionPane.showMessageDialog(null, "Estimado/a usuario: "+ Nombre + " " + "Usted puede votar");
            
            
        } else if (edad  <= 18) { 
            
            JOptionPane.showMessageDialog(null, "Estimado/a usuario: "+ Nombre + " " + "Usted no puede votar");
        }
        
        /// IF ANIDADO DIAS DE LA SEMANA
        ///
        /////Mensaje de bienvenida
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PROGRAMA QUE DETERMINA EL DIA DE LA SEMANA");
        
        //variables 
        
        int dia; 
        String lectura1;
        
        // inicializamos 
        
        lectura1 = "";
        dia = 0; 
        
        // inicio programa
        
        lectura1 = JOptionPane.showInputDialog("Digite el numero de del dia de la semana"); // digita el dia de la semana
        
        dia = Integer.parseInt(lectura1); // pasamos lectura a int dia 
        
        // inicio if 
        
        if ( dia == 1 ){
            
            JOptionPane.showMessageDialog(null, "El dia de la semana es lunes");
        
        } else if (dia == 2){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Martes");
            
        } else if (dia == 3){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Miercoles");
            
        } else if (dia == 4){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Jueves");
            
        } else if (dia == 5){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Viernes");
            
        } else if (dia == 6){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Sabado");
            
        } else if (dia == 7){
            JOptionPane.showMessageDialog(null, "El dia de la semana es Domingo");
            
        } 
        
        if (dia !=6 && dia != 7){
            
             JOptionPane.showMessageDialog(null, "Es un dia laboral");
        } else { 
            JOptionPane.showMessageDialog(null, "No es un dia laboral");
        }
        }
    
    
          
        }
       
           
        
        
        
    
    

