import Taller11.Ejercicio2.Gerente;
import Taller11.Ejercicio2.Vendedor;

void main() {

    Gerente gerente1 = new Gerente("Anastasio R", 3000000, 500000);
    Vendedor vendedor1 = new Vendedor("Tiburcio N", 2000000, 20000, 3);

    gerente1.mostrarDetalles();
    vendedor1.mostrarDetalles();
}