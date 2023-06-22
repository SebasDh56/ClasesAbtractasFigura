import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {
    List <Punto> listaPuntos =new ArrayList<>();

    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public void ingresarPuntos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa la componente x");



    }

    public double calcularDistacia(int i,int j){
        Punto punto1=listaPuntos.get(i);
        Punto punto2=listaPuntos.get(j);
        double dits=Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2)+
                (Math.pow(punto1.getX()-punto2.getX(),2)+
                        (Math.pow(punto1.getX()-punto2.getX(),2));
                return dits;


    }



    }
