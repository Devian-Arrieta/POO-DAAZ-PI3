package Taller11.Ejercicio2;

public abstract class Empleado {

    protected String nombre, tipoEmpleado;
    protected double salario;

    public Empleado(String nombre, String tipoEmpleado, double salario) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println(
                "DETALLES DEL EMPLEADO \n" +
                "Nombre: "+ nombre +"\n"+
                "Tipo de Empleado: "+ tipoEmpleado +"\n"+
                "Salario: "+ calcularSalario() +"\n"
        );
    }
}
