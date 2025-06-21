/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5_movies;

/**
 *
 * @author ashle
 */
public class Actor {
    
    
    // Declaramos las variables 
    
    
    private String actorName; 
    private String actorRoleName; 
    private int actorAge; 
    
    // Inicializamos las variables 

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorRoleName() {
        return actorRoleName;
    }

    public void setActorRoleName(String actorRoleName) {
        this.actorRoleName = actorRoleName;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }
    
    //Convertimos tostring para imprimir

    @Override
    public String toString() {
        return "Actors{" + "actorName=" + actorName + ", actorRoleName=" + actorRoleName + ", actorAge=" + actorAge + '}';
    }
    
    
    
    
    
}
