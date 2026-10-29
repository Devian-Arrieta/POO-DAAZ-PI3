package Taller13.Ejercicio3.Punto1;

/*
public class Ave implements Volador { // Class 'Ave' must either be declared abstract or implement abstract method 'volar()' in 'Volador'

    // Aquí genera error porque como es una interfaz está obligado a sobreescribir
    // el metodo que contiene, y al estar vacío este no cumple
}
 */

public class Ave implements Volador {

    @Override
    public void volar() {
        System.out.println("El ave vuela");
    }
}