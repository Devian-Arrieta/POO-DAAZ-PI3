import Taller11.Ejercicio1.Circulo;
import Taller11.Ejercicio1.Rectangulo;

void main() {

    Circulo circulo1 = new Circulo(6);
    Rectangulo rect1 = new Rectangulo(4, 8);

    circulo1.calcularArea();
    rect1.calcularArea();
    
    circulo1.mostrarArea();
    rect1.mostrarArea();
}