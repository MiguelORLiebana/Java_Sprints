package n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;

public class DniTest {

    static String[] letras = { "E","M","D","X","Q","G","P","J","E","Y"};
    static Integer[] dnis = {11859627,15461456,15485449,20096582,12453067,35575507,49592953,48157988,47472551,44736110};

    public static HashMap<Integer, String> omplirData(){

        HashMap<Integer, String> aux = new HashMap<Integer, String>();

        for(int i=0; i < letras.length; i++){
            aux.put(dnis[i], letras[i]);
        }

        return aux;
    }
    static HashMap<Integer, String> llista = omplirData();

    @ParameterizedTest
    @ValueSource(ints = {11859627,15461456,15485449,20096582,12453067,35575507,49592953,48157988,47472551,44736110})
    void calcularDniTest(Integer numero){

        CalculoDni dni = new CalculoDni();

        Assertions.assertEquals(llista.get(numero), dni.calcularDni(numero));
    }
}
