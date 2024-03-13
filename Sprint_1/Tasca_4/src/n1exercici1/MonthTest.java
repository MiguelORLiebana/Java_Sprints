package n1exercici1;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MonthTest extends TestCase {

    @Test
    void mesosLlistaComplertaTest(){
        String agost = "Agost";
        Month months = new Month();
        List<String> mesos;
        mesos = months.afegirMesos();

        Assertions.assertEquals(12, mesos.size());
        Assertions.assertEquals(agost, mesos.get(7));
    }
}
