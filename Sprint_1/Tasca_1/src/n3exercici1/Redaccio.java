package n3exercici1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class Redaccio {
    private List<Redactor> redactors = new ArrayList<>();
    private String nom;

    //*********** GESTIÓ DE REDACTORS - CREACIÓ I ELIMINACIÓ *********

    private void introdueixRedactor(Redactor redactor){
        redactors.add(redactor);
    }

    public void creaRedactor(){
        String nom = introduirNomRedactor();
        String dni = introduirDniRedactor();

        Redactor redactorAux = new Redactor(dni, nom);
        introdueixRedactor(redactorAux);
    }

    private String introduirNomRedactor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del redactor/a");
        nom = scanner.nextLine();
        return nom;
    }

    private String introduirDniRedactor(){
        System.out.println("DNI del redactor/a");
        Scanner scanner = new Scanner(System.in);
        String dni = scanner.nextLine();

        while(dni.length() != 3){
            System.out.println("Error, introduce dni apto:");
            dni = scanner.nextLine();
        }

        return dni;
    }

    public void deleteRedactor(){
        String auxDni = demanarDni();
        List<Redactor> redactorsAux = new ArrayList<>();
        int index = -1;
        Boolean existeixDni = false;

        if(redactors.isEmpty()){
            System.out.println("No hay redactors!!!");
        }
        else {
            try{
                for(Redactor redactor:redactors){
                    if(redactor.existeixDni(auxDni)){
                        existeixDni = true;
                        index =  redactors.indexOf(redactor);
                    }
                }

                if(existeixDni && index >= 0) {
                    redactors.remove(index);
                }
            } catch(ConcurrentModificationException e){
                System.out.println("Error con eliminación redactor");
            }
        }
    }

    public void mostrarRedactors(){
        if(redactors.isEmpty()){
            System.out.println("No hay redactors!!");
        }
        else{
            for(Redactor redactor: redactors){
                System.out.println("Redactor/a amb nom: " + redactor.getName()
                        + ", i Dni: " + redactor.getDni()
                        + " amb " + redactor.getNumNoticies() + " notícies");
            }
        }
    }

    private String demanarDni(){
        String aux;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el dni del redactor/a");
        aux = scanner.nextLine();
        return aux;
    }

    //*********** GESTIÓ DE NOTICIES - INTRODUIR/ELIMINAR/MOSTRAR *********

    public void introduirNoticiaRedactor(){
        String dni = demanarDni();
        String titular = demanarTitular();

        Noticia noticia = new Noticia(titular);
        afegirNoticiaRedactor(dni, noticia);
    }

    private void afegirNoticiaRedactor(String dni, Noticia noticia){
        for(Redactor redactor:redactors){
            if(redactor.existeixDni(dni))redactor.afegirNoticia(noticia);
        }
    }

    public void eliminarNoticiaRedactor(){
        String dni = demanarDni();
        String titular = demanarTitular();
        Boolean eliminar = false;
        Integer index = -1;

        if(!redactors.isEmpty()){
            for(Redactor redactor:redactors){
                if(redactor.existeixDni(dni) && redactor.existeixNoticia(titular)) {
                    eliminar = true;
                    index = redactors.indexOf(redactor);
                }
            }

            if(eliminar && index >= 0){
                Redactor redactorElimNot = redactors.get(index);
                redactorElimNot.eliminarNoticia(titular);
            } else System.out.println("No existe la noticia con titular: " + titular);
        } else System.out.println("No hay redactors");

    }

     private String demanarTitular(){
        String titular;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el titular de la noticia:");
        titular = scanner.nextLine();
        return titular;
    }

    public void mostrarNoticiesRedactor(){
        String dni = demanarDni();

        for(Redactor p:redactors){
            if(p.existeixDni(dni)){
                p.mostrarNoticies();
            }
        }
    }


    //*********** GESTIÓ DE NOTICIES - VALOR I PUNTUACIO DE NOTICIES *********
    public void calcularPuntuacioNoticia(){
        String dni = demanarDni();
        String titular = demanarTitular();
        Noticia noticia;

        if(!redactors.isEmpty()) {
            Redactor redactor = getRedactor(dni);
            noticia = redactor.getNoticia(titular);
            Integer punts = noticia.getPunts(titular);
            System.out.println("Els punts de la noticia son: " + punts);
        }else System.out.println("Error - No hay redactors!");
    }

    public void calcularPreuNoticia(){
        String dni = demanarDni();
        String titular = demanarTitular();
        Noticia noticia;

        if(!redactors.isEmpty()) {
            Redactor redactor = getRedactor(dni);
            noticia = redactor.getNoticia(titular);
            System.out.println("Els punts de la noticia son: " + noticia.getPreu(titular));
        }else System.out.println("Error - No hay redactors!");
    }

    private Redactor getRedactor(String dni){
        return redactors
                .stream()
                .filter(a -> a.getDni().equals(dni))
                .findFirst()
                .get();
    }

//    private void incrementSouRedactors(int increment){
//        for(Redactor p:redactors){
//            p.incrementSou(increment);
//        }
//    }
}

