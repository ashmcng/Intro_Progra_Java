/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaenum;

/**
 *
 * @author ashle
 */
class persona {
    String nombre;
    ColorFavorito color;

    public persona(String nombre, ColorFavorito color) {
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return  nombre + " " +  "ama el color" + " " + color;
    }
    
    
}
