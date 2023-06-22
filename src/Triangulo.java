public class Triangulo extends Figura{
    double l3;
    double l2;
    double l1;
    @Override
    public double calcularPerimetro() {
        l1=calcularDistacia(0,1);
        l2=calcularDistacia(0,2);
        l3=calcularDistacia(1,2);
        return l1+l2+l3;
    }

    @Override
    public double calcularArea() {
        double s1=calcularPerimetro()/2;
        double area=Math(s*(s-l1)*(s-))

        return 0;
    }
}
