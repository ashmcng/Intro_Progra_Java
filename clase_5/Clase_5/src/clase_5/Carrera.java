/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_5;

/**
 *
 * @author ashle
 */
public class Carrera {
    
    private String nombreCarrera; 
    private int creditosCarrera;
    private boolean diplomado; 
    private boolean bachillerato; 
    private boolean licenciatura; 
    private boolean maestria; 
    private boolean doctorado; 
    private double costoCarrera; 
    
    // set and getter way to inicialiace all variabables at once without coding it itself. 
    

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getCreditosCarrera() {
        return creditosCarrera;
    }

    public void setCreditosCarrera(int creditosCarrera) {
        this.creditosCarrera = creditosCarrera;
    }

    public boolean isDiplomado() {
        return diplomado;
    }

    public void setDiplomado(boolean diplomado) {
        this.diplomado = diplomado;
    }

    public boolean isBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(boolean bachillerato) {
        this.bachillerato = bachillerato;
    }

    public boolean isLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(boolean licenciatura) {
        this.licenciatura = licenciatura;
    }

    public boolean isMaestria() {
        return maestria;
    }

    public void setMaestria(boolean maestria) {
        this.maestria = maestria;
    }

    public boolean isDoctorado() {
        return doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    public double getCostoCarrera() {
        return costoCarrera;
    }

    public void setCostoCarrera(double costoCarrera) {
        this.costoCarrera = costoCarrera;
    }
    
    
    /// end of inizialation variables, 
 
}
