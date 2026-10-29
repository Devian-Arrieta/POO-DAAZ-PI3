package Taller11.Ejercicio2;

public class Vendedor extends Empleado {

    private double valorComisionPorVenta;
    private int numeroDeVentas;

    public Vendedor (String nombre, double salario, double valorComisionPorVenta, int numeroDeVentas) {
        super(nombre, "Vendedor", salario);
        this.valorComisionPorVenta = valorComisionPorVenta;
        this.numeroDeVentas = numeroDeVentas;
    }

    @Override
    public double calcularSalario() {
        return salario + (numeroDeVentas * valorComisionPorVenta);
    }
}
