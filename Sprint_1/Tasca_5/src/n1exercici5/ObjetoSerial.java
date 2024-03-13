package n1exercici5;

import java.io.Serializable;

public class ObjetoSerial implements Serializable {

    // https://chuidiang.org/index.php?title=Serializaci%C3%B3n_de_objetos_en_java
    // https://www.digitalocean.com/community/tutorials/objectoutputstream-java-write-object-file#java-objectoutputstream-example-to-write-object-to-file

    private static final Integer Id = 10001;

    @Override
    public String toString(){
        return "The item id is: " + Id;
    }
}
