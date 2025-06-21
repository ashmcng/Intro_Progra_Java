/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen_libros;

import javax.swing.JOptionPane;

/**
 *
 * @author ashle
 */
public class Almacen_Libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // VERSION DONDE EL USUARIO INGRESA LOS VALORES DE LA VARIABLE LIBRO 
        
        String nombreLibro = JOptionPane.showInputDialog("Ingrese el título:");
        String nombreAutor = JOptionPane.showInputDialog("Ingrese el autor:");
        int paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las páginas:"));
        
        // Creamos un libro 
        
        Libro Libro1 = new Libro(nombreLibro, nombreAutor, paginas); 
        
        //Imprimimos el libro 
        
        JOptionPane.showInternalMessageDialog(null, "El libro creado es  " + Libro1);
        
        // Preguntamos al usuario si desea cambiar un dato ingresado 
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea cambiar algún dato del libro creado?");
        
        boolean seguirEditando = (opcion == JOptionPane.YES_OPTION); // ASIGNAMOS A VALOR BOOLEANO PARA HACER EL WHILE MÁS SENCILLO 
        
        while (seguirEditando) {

            int option2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que Deseas Editar?\n"
                    + "1. Titulo\n"
                    + "2.Nombre del autor\n"
                    + "3. Numero de Paginas\n"
                    + "4. Salir"));
            
            switch (option2) {
                
                // Pedimos los nuevos valores

                case 1:
                    String nuevoTitulo = JOptionPane.showInputDialog("Digite el nuevo Titulo");
                    Libro1.setNombreAutor(nuevoTitulo);
                    break;
                case 2:
                    String nuevoAutor = JOptionPane.showInputDialog("Digite el nuevo Autor");
                    Libro1.setNombreLibro(nuevoAutor);
                    break;

                case 3:
                    int nuevoPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las páginas:")); 
                    Libro1.setPaginas(nuevoPaginas);
                    break;

                case 4:
                    seguirEditando = false; 
                    continue; // para que siga preguntando 
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    continue; 
            }

            // consultamos si desea seguir editando 
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea cambiar algo más");
            seguirEditando = (respuesta == JOptionPane.YES_OPTION);

        }

        //Imprimimos el libro actualizado 
        JOptionPane.showInternalMessageDialog(null, "El libro actualizado es  " + Libro1);

    }
        
        
    }
    

