package Taller12.Ejercicio3;

/*
public class Elefante implements Comedor { // Class 'Elefante' must either be declared abstract or implement abstract method 'comer()' in 'Comedor'

    // Al no haber ningún argumento, java genera error porque exige definir y sobreescribir
    // si o si el metodo comer() aquí
}

 */


public class Elefante implements Saltador {

    public Elefante(){

    }

    @Override
    public void saltar(){
        System.out.println("El elefante está saltando");
    }
    /*
    El codigo compila, pero es una mala practica de diseño, ya que
    en la vida real los elefantes no pueden saltar, entonces este
    comportamiento es ilogico aquí para un elefante
    */
}
