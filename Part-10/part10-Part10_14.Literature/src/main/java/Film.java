/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JESUS
 */
public class Film {
    private String name;
    private int releaseYear;

    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getReleaseYear() {
        return this.releaseYear;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.releaseYear + ")";
    }
    
    
}
