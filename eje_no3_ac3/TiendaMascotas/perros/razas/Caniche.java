package TiendaMascotas.perros.razas;

import TiendaMascotas.perros.PerroPequeno;

public class Caniche extends PerroPequeno {
    public Caniche(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Raza: Caniche");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
        System.out.println("¿Muerde?: " + muerde);
    }
}