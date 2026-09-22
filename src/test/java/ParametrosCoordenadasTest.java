import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrosCoordenadasTest {

    @Test
    public void deveRetornarX(){
        ParametrosCoordenadas.getInstance().setX(2.4);
        assertEquals(2.4, ParametrosCoordenadas.getInstance().getX());
    }

    @Test
    public void deveRetornarY(){
        ParametrosCoordenadas.getInstance().setY(1.5);
        assertEquals(1.5, ParametrosCoordenadas.getInstance().getY());
    }
}
