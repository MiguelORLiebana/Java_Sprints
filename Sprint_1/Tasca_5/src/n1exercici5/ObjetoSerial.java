package n1exercici5;

import java.io.Serializable;

public class ObjetoSerial implements Serializable {

    // https://chuidiang.org/index.php?title=Serializaci%C3%B3n_de_objetos_en_java
    //https://www.digitalocean.com/community/tutorials/objectoutputstream-java-write-object-file#java-objectoutputstream-example-to-write-object-to-file

    public int a;
    public String b;
    public char c;
    private static final long serial = -1902384719382471083L;

    @Override
    public String toString(){
        return "Hello Wordl" + serial;
    }

//    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException
//    {
//        // Aqui debemos leer los bytes de stream y reconstruir el objeto
//    }
//
//    private void writeObject(ObjectOutputStream stream) throws IOException
//    {
//        // Aquí escribimos en stream los bytes que queramos que se envien por red.
//    }
}
