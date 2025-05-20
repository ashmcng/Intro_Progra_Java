/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_notas_if;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Sistema_Notas_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Este es un sistema basico de calificaciones con el uso de if (condicional) 
        
        //Definimos varibles 
        
        double nota; 
        String Nombre; 
        String lectura; 
        String Materia;
        String Estado; 
        
        //Declaramos las variables vacias 
        
        nota = 0; 
        Nombre = " ";
        lectura = " "; 
        Estado = " "; 
        
        // Mensaje de bievenida 
        
        JOptionPane.showMessageDialog(null, "Bievenido al sistema basico de calificiones");
        
        // INICIO DEL PROGRAMA 
        
        Nombre = JOptionPane.showInputDialog("Digite su nombre"); //Pedimos al usuario su nombre para efectos de impresion 
        Materia = JOptionPane.showInputDialog("Digite el nombre de la materia"); //Pedimos al usuario el nombre de la materia para efectos de impresion 
        lectura = JOptionPane.showInputDialog("Digite la calificion obtenida en la materia"); //Pedimos la calificacion ob tenida 
        
        nota = Integer.parseInt(lectura); // Asignamos el valor de lectura de la nota a la variable nota 
        
        // CALCULAMOS EL ESTADO DE LA MATERIA 
        
        if ( nota >= 70) { 
            
            Estado = "materia aprobada"; // MAYOR O IGUAL A 70 ESTA APROBADO 
            
        } else if (nota <= 69) { // MENOR O IGUAL A 69 ESTA REPROBADO 
            
            Estado = "materia reprobada"; 
        }
        
        // FIN IF 
        
        // OUTPUT 
        
        JOptionPane.showMessageDialog(null, "Estimado/a Estudiante:  " + Nombre + ", " + "en la materia: " + Materia + ", " + "su nota obtenida fue:  " + nota + "\n" +
                ", "+ "lo que significa que usted tiene la  " + Estado);
        
    }
    
  }
       
                  
        
   
