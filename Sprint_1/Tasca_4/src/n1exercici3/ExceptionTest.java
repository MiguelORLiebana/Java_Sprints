package n1exercici3;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ExceptionTest extends TestCase {
    @Test
    void CathExceptionTest(){

        ExceptionCustom aux = new ExceptionCustom();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> aux.getException());

        String expectedMessage = "Exepció: ArrayIndexOutOfBoundsException";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
