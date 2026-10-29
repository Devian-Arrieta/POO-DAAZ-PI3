import Taller11.Ejercicio3.Lavadora;

void main() {
  /*
  // al intentar instanciar una clase abstracta directamente
  Electrodomestico miAparato = new Electrodomestico(); // Electrodomestico is abstract; cannot be instantiated
   */

  // El código correcto para usar la herencia sería:
  Lavadora lavadora1 = new Lavadora();
  lavadora1.prender();
}