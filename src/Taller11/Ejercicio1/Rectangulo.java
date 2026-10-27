package Taller11.Ejercicio1;

public class Rectangulo extends Figura{

    private double base, altura;

    public Rectangulo(double base, double altura){
        super("rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        this.area = (base * altura);
    }
}
