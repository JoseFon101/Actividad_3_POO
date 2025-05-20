package TiendaMascotas.gatos;

import TiendaMascotas.Gato;

public abstract class GatoSinPelo extends Gato {
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
}