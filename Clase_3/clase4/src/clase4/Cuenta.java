/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Cuenta {
    
  // declaramos variables 
    
  public int Num_cuenta; // numero de cuenta
  public String Nom; // nombre del cliente 
  public double Estado_cuenta; // estado de cuenta 
  public int valor; // valor de la transferencia 
  
  
  
  
  // inicializamos variables 
  
  
  public void transferencia(){
      
      if (valor <= Estado_cuenta) 
          
         JOptionPane.showMessageDialog(null, "Transferencia realizada con exito");
      
         else if (valor > Estado_cuenta)
             
         JOptionPane.showMessageDialog(null, "Saldo insufieciente");
   
  }
}
