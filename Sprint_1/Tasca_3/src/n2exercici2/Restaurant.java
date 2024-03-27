package n2exercici2;

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

        Restaurant restaurant = (Restaurant) o;

        if(this.nom.equals(restaurant.getName()) && this.puntuacio == getPuntuacio()){
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    public String getName(){
        return this.nom;
    }

    public int getPuntuacio(){
        return this.puntuacio;
    }

    @Override
    public String toString(){
        return "Restaurant: " + this.nom + " with a scoring of: " + this.puntuacio;
    }
}
