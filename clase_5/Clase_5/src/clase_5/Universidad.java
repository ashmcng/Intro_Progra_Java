/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_5;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */  
public class Universidad {
    
    private String codigoU;
    public String nombreU;
    
    
    // method practice 
    
    public void publicidad(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Esta es la publicidad numero" + i +
                    "\n codigo U +" + codigoU ); 
            
        }
        
        
    }
    
    }
    
    

