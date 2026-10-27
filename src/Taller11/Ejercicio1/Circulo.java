package Taller11.Ejercicio1;

public class Circulo extends Figura{

    private double radio;
    private double pi = 3.1415;

    public Circulo (float radio){
        super("circulo");
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
        this.area = (pi * (radio * radio));
    }
}
