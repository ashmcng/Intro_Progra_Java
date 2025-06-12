/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_5;

/**
 *
 * @author ashle
 */
public class Clase_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Practica de atributos publicos y privados 
        */
        
         Universidad u1 = new Universidad(); 
         u1.nombreU="Fidelitas"; // U1 se puede ver y utilizar fuera de la clase ya que la variable es publica 
         
         Carrera carrera = new Carrera(); // way to create an instance of variable 
         
         carrera.setNombreCarrera("Topografia"); // set up the value of each variable for that specific instance 
         
         
         
    }
    
    public static void otroEjemploCarrera(){  /// way to create separate instances that can run on the same code individualiall 
        
        
    }
}
