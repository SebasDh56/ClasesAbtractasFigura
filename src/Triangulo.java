public class Triangulo extends Figura {
    double l1, l2, l3;

    @Override
    public double calcularPerimetro() {
        l1 = calcularDistancia(0, 1);
        l2 = calcularDistancia(0, 2);
        l3 = calcularDistancia(1, 2);
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - l1) * (semiperimetro - l2) * (semiperimetro - l3));
        return area;
    }}