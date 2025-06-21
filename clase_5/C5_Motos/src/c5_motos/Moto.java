/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5_motos;

/**
 *
 * @author ashle
 */
public class Moto {
    
    private String marca; 
    private String CC; 
    private double peso; 
    private String nombrePersona; 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    // click derecho insert code to string genera todas las variables a un string

    @Override
    public String toString() {
        return "Moto{" + "marca=" + marca + ", CC=" + CC + ", peso=" + peso + ", nombrePersona=" + nombrePersona + '}';
    }
    
    
    
}
