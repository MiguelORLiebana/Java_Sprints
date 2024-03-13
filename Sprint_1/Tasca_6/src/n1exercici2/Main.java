package n1exercici2;

public class Main
{
    public static void main(String[] args) {

        GenericMethods a = new GenericMethods();
        String palabra = "Hola";
        Persona persona = new Persona("Juan", "Perez", 20);
        Integer primitiu = 8;

        a.generic(palabra, persona, primitiu);

        a.generic(primitiu, palabra, persona);
    }
}
