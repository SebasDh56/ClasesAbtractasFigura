import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test
    void testCalcularPerimetro() {
        Circulo c = new Circulo();
        c.radio = 5;

        double perimetro = c.calcularPerimetro();

        assertEquals(2 * Math.PI * 5, perimetro, 0.0001);
    }

    @Test
    void testCalcularArea() {
        Circulo c = new Circulo();
        c.radio = 3;

        double area = c.calcularArea();

        assertEquals(Math.PI * 9, area, 0.0001);
    }
}
