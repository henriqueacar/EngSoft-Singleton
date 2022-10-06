import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomaTest {

    @Test
    public void deveConferirSoma(){

        assertEquals(11, Soma.getInstance().somaDoisNumerosInteiros(5, 6));

    }

}