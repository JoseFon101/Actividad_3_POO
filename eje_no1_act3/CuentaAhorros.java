/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eje_no1_act3;

/**
 *
 * @author user
 */
public class CuentaAhorros extends Cuenta{
    private boolean activa;
     
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
            if (saldo < 10000) 
                activa = false;
            else
                activa = true;
        }
    
    public void retirar(float cantidad) {
    if (activa) 
        super.retirar(cantidad); 
        }
    
    public void consignar(float cantidad) {
    if (activa)
        super.consignar(cantidad); 
    }
    
    public void extractoMensual() {
        if (númeroRetiros > 4) {
            comisiónMensual += (númeroRetiros - 4) * 1000;
        }
        super.extractoMensual(); 
        if ( saldo < 10000 )
        activa = false;
    }
    
     public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comision mensual =  $ " +  comisiónMensual);
        System.out.println("Numero de transacciones = " + (númeroConsignaciones + númeroRetiros));
        System.out.println();
    }
}
