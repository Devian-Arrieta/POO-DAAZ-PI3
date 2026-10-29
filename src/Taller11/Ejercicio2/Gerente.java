package Taller11.Ejercicio2;

public class Gerente extends Empleado {

    private double bono;

    public Gerente (String nombre, double salario, double bono){
        super(nombre, "Gerente", salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        return salario + bono;
    }
}
