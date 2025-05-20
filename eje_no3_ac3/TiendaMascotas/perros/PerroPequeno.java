package TiendaMascotas.perros;

import TiendaMascotas.Perro;

public abstract class PerroPequeno extends Perro {
    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
}