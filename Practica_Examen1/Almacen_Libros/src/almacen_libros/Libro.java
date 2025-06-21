/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen_libros;

/**
 * REPRESNTA UN LIBRO CON EL NOMBRE DEL AUTOR + EL NUMERO DE PAGINAS
 * @author ashle
 */
public class Libro {
    
    // DECLARAMOS LAS VARIABLES 
    
    private String nombreLibro; 
    private String nombreAutor; 
    private int paginas;
    
    
    //INICIALIZAMOS LAS VARIABLES MEDIANTE LOS CONSTRUCTORES 

    public Libro(String nombreLibro, String nombreAutor, int paginas) {
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.paginas = paginas;
    }
    
    // HACEMOS LOS SETTER Y GETTER EN CASO DE QUE ALGUN VALOR NECESITE SE CAMBIADO 

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    // GENERAMOS EL TOSTRING PARA LA IMPRESION FINAL DE LAS VARIABLES

    @Override
    public String toString() {
        return   "EL nombre del Libro es  " + nombreLibro +  " " +  "El nombre del autor es   " + nombreAutor + " " + "La cantidad de paginas del libro es de " + paginas;
    }
    
    
    
    
   
    
    
    
    
}
