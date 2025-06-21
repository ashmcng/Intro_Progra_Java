/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c5_motos;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class C5_Motos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        * Realiazar un programa que debe de imprimir la informacion de una carrera de motos 
        debe imprimir la informacion de tanto la carrera y los participantes 
        */
        
        // registrar informacion de la carrera
        
        Carrera c1 = new Carrera();
        c1=registroCarrera(c1); 
        JOptionPane.showConfirmDialog(null, c1.toString());
    }
    
    /*
    Ejemplo de registro de carrera 
    */
    
    public static Carrera registroCarrera(Carrera carrera){  // nombre clase + nombre del registro----  esto es para guardar la informacion de cada carrera de manera separada 
       // carrera.nombreCarrera(JOptionPane.showInputDialog("Digite el nombre de la carrera")); 
       
       carrera.setNombreCarrera(JOptionPane.showInputDialog("Digite el nombre de la carrera"));
       carrera.setVuelta(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vueltas")));
       
               
       return carrera;
       
      
     
        
    }
    
    }
    

