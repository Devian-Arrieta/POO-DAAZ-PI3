package Taller13.Ejercicio1;

public class Triangulo extends Figura{

    private double base, altura;

    public Triangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){

        double area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
