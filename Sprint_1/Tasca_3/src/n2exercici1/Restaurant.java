package n2exercici1;

import java.util.Objects;

public class Restaurant {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio){
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o){
        Restaurant resutaurant = (Restaurant) o;

        if(this.nom.equals(resutaurant.getName()) && this.puntuacio == getPuntuacio()){
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    private String getName(){
        return this.nom;
    }

    private int getPuntuacio(){
        return this.puntuacio;
    }

    @Override
    public String toString(){
        return "Restaurant: " + this.nom + " with a scoring of: " + this.puntuacio;
    }
}


//Notes:
//https://es.stackoverflow.com/questions/122928/hashset-como-funciona-exactamente/122942
//https://www.arquitecturajava.com/java-override-hashcode-y-curiosidades/
//https://www.youtube.com/watch?v=dwGolcKOpjE