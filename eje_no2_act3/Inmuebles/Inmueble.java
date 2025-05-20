/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author user
 */
public class Inmueble {
    
    protected int identificadorInmobiliario;
    protected int área;
    protected String dirección;
    protected double precioVenta;
    
    Inmueble(int identificadorInmobiliario, int área, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.área = área;
        this.dirección = dirección;
    }

    double calcularPrecioVenta(double valorArea) {
        precioVenta = área * valorArea;
        return precioVenta;
    }

    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area = " + área);
        System.out.println("Direccion = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }
    
}
