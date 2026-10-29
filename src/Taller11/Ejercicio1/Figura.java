package Taller11.Ejercicio1;

public abstract class Figura {

    protected double area;
    protected String figura;

    protected Figura(String figura){
        this.figura = figura;
    }

    public abstract void calcularArea();

    public void mostrarArea() {
        calcularArea();
        System.out.println("El área del "+ figura +" es: "+ area);
    }
}
