package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private final String dni;
    private String nom;
    private int sou;
    private List<Noticia> noticias = new ArrayList<>();
    private int id;
    private static int IdNext = 1;

    public Redactor(String dni, String nom){
        this.dni = dni;
        this.nom = nom;
        sou = 1500;
        id = IdNext;
        IdNext++;
    }

//    public void incrementSou(int increment){
//        this.sou += increment;
//    }

    public boolean existeixDni(String dni){
        if(this.dni.equals(dni)) {
            return true;
        }else return false;
    }

    public String getDni(){
        return this.dni;
    }

    public String getName() {
        return this.nom;
    }

    public Integer getNumNoticies(){
        if(noticias.isEmpty()) return 0;
        else return noticias.size();
    }

    public void mostrarNoticies(){
        if(noticias.isEmpty()){
            System.out.println("No hay noticias!!!");
        }
        else{
            for(Noticia n:noticias){
                n.mostrarTitular();
            }
        }
    }

    public boolean existeixNoticia(String titular){
        String titularEx;

        if(noticias.isEmpty()){
            return false;
        } else{
            for(Noticia noticia: noticias){
                titularEx = noticia.getTitular();

                if(titularEx.equals(titular)) return true;
            }
            return false;
        }
    }

    public Noticia getNoticia(String titular){

        return noticias
                .stream()
                .filter(a -> a.getTitular().equals(titular))
                .findFirst()
                .get();
    }

    public void eliminarNoticia(String titular){

        Integer index = -1;
        Boolean eliminar = false;
        Noticia noticiaBorrar = new Noticia("");

        if(!noticias.isEmpty()){
            for(Noticia noticia: noticias){
                if(noticia.getTitular().equals(titular)){
                    eliminar = true;
                    index = noticias.indexOf(noticia);
                }
            }
            if(eliminar && index >= 0){
                noticiaBorrar = noticias.get(index);
                noticias.remove(noticiaBorrar);
            }
        }else System.out.println("No hay noticias!");
    }

    public void afegirNoticia(Noticia noticia){
        noticias.add(noticia);
    }
}

