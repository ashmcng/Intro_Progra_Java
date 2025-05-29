/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prectica_evaluada1_ashleymc;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Prectica_Evaluada1_AshleyMc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //UNA EMPRESA DEBE DETERMINA EL MONTO TOTAL A PAGAR A LA CAJA DEL SEGURO SOCIAL (CCSS)
        
        // DEFINIMOS LAS VARIABLES
        
        double Salario_Bruto; //salario del usuario 
        double Seguro_SEM; //Seguro de Enfermedad y Maternidad 9.25% 
        double Seguro_IVM; //Seguro de vida y Muerte 5,08% 
        double Asosacion; 
        double Pago_Total; //Calculo del total
        double Total_CCSS; //total a la cajaç
        double neto; // sal neto
        double resta; // resta sal bruto
        String nom; // Para fines de impresion de datos 
        String Lectura; // Variable string para poder leer el int inicial del salario 
        
        
        // Inicializamos la variables 
        
        Salario_Bruto = 0; 
        Seguro_SEM = 0; 
        Seguro_IVM = 0; 
        Asosacion = 0; 
        Pago_Total = 0; 
        Total_CCSS = 0; 
        resta = 0; 
        neto = 0; 
        nom = " ";
        Lectura = " ";
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL PROGRAMA QUE CALCULA CUANTO DEBE A LA CCSS"); // MENSAJE DE BIENVENIDA 
        
        nom = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EMPLEADO"); // Pedimos Nombre del empleado
        Lectura = JOptionPane.showInputDialog("DIGITE EL SALARIO BRUTO DEL EMPLEADO"); //Pedimos el salario base para calcular las deducciones 
        
        Salario_Bruto = Integer.parseInt(Lectura); // Asignamos el valor de lectura al salario bruto 
                
        // Calculos 
        
        Seguro_SEM = Salario_Bruto - (Salario_Bruto * 9.25/100); // Calculamos la deducion del seguro de enfermedad y maternidad 
        Seguro_IVM = Salario_Bruto - (Salario_Bruto * 5.08/100); // Calculamos la deducion del seguro de vida y muerte
        neto = Salario_Bruto - (Seguro_IVM + Seguro_SEM);  
        resta = ((neto * 2.5)/100);
        Asosacion = neto - resta; // Calculamos la deducion lo que se debe a la asosacion 
        Pago_Total = Salario_Bruto + Seguro_IVM + Asosacion; 
        Total_CCSS = Seguro_IVM + Seguro_SEM; 
        
        //OUTPUT 
        
        JOptionPane.showMessageDialog(null, "Para el Empleado/a "+ nom + " "+ "El pago total de deducciones es de;  "+ Pago_Total + " "+ "La Empresa deberá abonar al CCSS; " + Total_CCSS + " " + "\n" +
                "Lo cual se divide en Seguro SEM " + Seguro_SEM + " " +"Lo cual se divide en Seguro IVM " + Seguro_IVM + " " + "Mas lo que debe a la asosacion es " + "\n" +
                Asosacion);
        
        
    }
    
}
