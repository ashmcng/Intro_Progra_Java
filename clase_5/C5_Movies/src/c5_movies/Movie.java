/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c5_movies;

/**
 *
 * @author ashle
 */
public class Movie {
    
    // Declaramos las variables 
    
    private String movieName; 
    private int movieYear; 
    private int movieTime; 
    private Actor actor1; 
    private Actor actor2; 
    
    //Inicializamos las variables 

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    
    // añadimos el string para imprimir 

    @Override
    public String toString() {
        return "Movie{" + "movieName=" + movieName + ", movieYear=" + movieYear + ", movieTime=" + movieTime + '}';
    }
    
    
    
    
}
