package Taller12.Ejercicio2;

public class Pez implements Nadador, Respirador {

    public String tipoDePez;

    public Pez (String tipoDePez) {
        this.tipoDePez = tipoDePez;
    }

    @Override
    public void nadar(){
        System.out.println("El pez "+tipoDePez+" está nadando 🐟");
    }

    @Override
    public void respirar() {
        System.out.println("El pez "+tipoDePez+" está respirando glu glu glu");
    }
}
