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
public class Cancion {
    
    public String Pais;
    public String usu;
    public int ncanciones; 
    public int nplays; 
    
    public int playlistmegusta(){
        
        if (nplays > 1) {
            return ncanciones + 1;
            
        } else if (nplays >= 0) {
            return ncanciones - 1;
        }

    return 0;

    }
    }
