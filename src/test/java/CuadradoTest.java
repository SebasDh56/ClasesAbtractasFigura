import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuadradoTest {

    @Test
    void testCalcularPerimetro() {
        Cuadrado cuad = new Cuadrado();
        cuad.listaPuntos.add(new Punto(0, 0, 0));
        cuad.listaPuntos.add(new Punto(2, 0, 0)); // distancia = 2

        double perimetro = cuad.calcularPerimetro();

        assertEquals(8, perimetro, 0.0001);
    }

    @Test
    void testCalcularArea() {
        Cuadrado cuad = new Cuadrado();
        cuad.listaPuntos.add(new Punto(0, 0, 0));
        cuad.listaPuntos.add(new Punto(4, 0, 0)); // lado = 4

        double area = cuad.calcularArea();

        assertEquals(16, area, 0.0001);
    }
}
