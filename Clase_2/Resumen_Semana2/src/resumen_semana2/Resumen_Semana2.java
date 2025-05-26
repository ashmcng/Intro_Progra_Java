/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resumen_semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Resumen_Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // VAMOS A USER LA FUNCION DE IF + EQUALS/COMPARETO + SWITCH 
        
        
        // DEFINIMOS VARIABLES 
        
        String user;
        String Lectura;
        String Lectura2;
        String Lectura3;
        int edad;
        int year;
        int pwd;
        int Opcion; 
        
        // INCIALIZAMOS LAS VARIABLES 
        
        user = " "; 
        Lectura = " "; 
        Lectura2 = " "; 
        Lectura3 = " ";
        edad = 0; 
        year = 0;
        pwd = 0; 
        Opcion = 0; 
        
        // Mensaje de bienvenida 
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PRGRAMA INICIE SECCION");
        
        //LOGIN 
        
        // User = admin , pwd = 1234
        
        
        user = JOptionPane.showInputDialog("Digite su nombre de Usuario"); // pedimos nombre de usuario 
        Lectura = JOptionPane.showInputDialog("Digite su contraseña"); // leemos la contrasena 
        pwd = Integer.parseInt(Lectura); // Asignamos el valor que leimos en lectura a la contrasena
        
        // Inicio del if 
        if (user.compareTo("admin") == 0 && pwd == 1234 ) { 
            
            JOptionPane.showMessageDialog(null, "Su usuario es correcto"); 
            
            Lectura2 = JOptionPane.showInputDialog("Digite 1 para calcular su edad, digite 2 para salir del programa "); // leemos que quiere el usuario 
            
            Opcion = Integer.parseInt(Lectura2); // Asignamos el valor de lectura 
            
            switch (Opcion) { // creamos los casos de lo que pueda escoger
                
                case 1: 
                    Lectura3 = JOptionPane.showInputDialog("Digite su año de nacimiento"); // leemos su año de nacimiento 
                    
                    year = Integer.parseInt(Lectura3); // Asignamos el valor de lectura a year
                    
                    edad = (2025 - year);  // Calculamos la edad
                    
                    JOptionPane.showInternalMessageDialog(null, "Su año de nacimiento es:  " + year + " " + "Su edad es: " + edad); // Output 
                case 2: 
                    JOptionPane.showMessageDialog(null, "Haz salido del programa "); 
                    
            }
              
        }else{
            JOptionPane.showMessageDialog(null, "Su usuario es incorrecto");
            
            //fin if 
         }
        }
    }
    

