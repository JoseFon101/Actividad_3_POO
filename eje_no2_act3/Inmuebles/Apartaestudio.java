/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author user
 */
public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;
        public Apartaestudio(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }
 
    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
