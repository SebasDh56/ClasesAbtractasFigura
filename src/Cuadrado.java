import java.util.Scanner;

public class Cuadrado extends Figura{
    double l;
    @Override
    public double calcularPerimetro() {
        double perimetro=l*4;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        return Math.pow(l,2);
    }


    public void ingresarlado(){
        Scanner sc=new Scanner(System.in);

    }

}


