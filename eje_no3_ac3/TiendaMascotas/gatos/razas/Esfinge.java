package TiendaMascotas.gatos.razas;

import TiendaMascotas.gatos.GatoSinPelo;

public class Esfinge extends GatoSinPelo {
    public Esfinge(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Raza: Esfinge");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Altura de salto: " + alturaSalto);
        System.out.println("Longitud de salto: " + longitudSalto);
    }
}