package Taller11.Ejercicio3;

public abstract class Electrodomestico {

    /*
    Aquí hay un error ´porque es un metodo concreto en lugar de abstract
    además que se definió con cuerpo (llaves) en lugar de usar "abstract"
    y esto es una mala práctica porque no obliga a las clases derivadas a crear
    su propia versión obligatoria del metodo
     */
    public void prender() {
        System.out.println("Prendiendo electrodomestico");
    }
}
