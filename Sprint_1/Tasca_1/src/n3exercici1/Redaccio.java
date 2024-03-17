package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Redaccio {
    private List<Redactor> redactors = new ArrayList<>();
    private String auxDni;
    private String dni;
    private String nom;

    //*********** GESTIÓ DE REDACTORS - CREACIÓ I ELEMINACIÓ *********

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
        auxDni = demanarDni();
        int aux;

        for(Redactor r:redactors){
            if(r.existeixDni(auxDni)){
                //r = null;
                aux = redactors.indexOf(r);
                redactors.remove(aux);
            }
        }
    }

    public void mostrarRedactors(){
        for(Redactor redactor: redactors){
            System.out.println("Redactor/a amb nom: " + redactor.getName()
                    + ", i Dni: " + redactor.getDni()
                    + " amb " + redactor.getNumNoticies() + " notícies");
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
            if(redactor.existeixDni(auxDni))redactor.afegirNoticia(noticia);
        }
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

    private void incrementSouRedactors(int increment){
        for(Redactor p:redactors){
            p.incrementSou(increment);
        }
    }
}

