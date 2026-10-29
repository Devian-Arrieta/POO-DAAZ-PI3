package Taller12.Ejercicio1;

public class Ave implements Volador, Cantante {

    private String tipoDeAve;

    public Ave (String tipoDeAve) {
        this.tipoDeAve = tipoDeAve;
    }

    @Override
    public void volar() {
        System.out.println("El ave "+tipoDeAve+" está volando 🕊");
    }

    @Override
    public void cantar() {
        System.out.println("El ave "+tipoDeAve+" está cantando fiu fiu fiu 🎶");
    }
}
