
public class Cuadrado extends Figura {
    double lado;

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}




