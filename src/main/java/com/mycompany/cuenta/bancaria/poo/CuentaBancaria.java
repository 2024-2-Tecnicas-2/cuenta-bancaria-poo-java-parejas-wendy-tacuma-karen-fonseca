package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
 
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;
    
    //Constructores

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.5;
    }
    
    // METODOS PIBLICOS

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingresar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva");
        }
    }
    public void retirar(double cantidad){
        if(cantidad > 0){
            if(cantidad <+ saldo){
                saldo -= cantidad;
            } else {
                System.out.println("No se puede retirar mas de lo que hay en la cuenta");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva");
        }
    }
    
    public double calcularInteres(){
        return saldo + (saldo * tipoInteres / 100);
    }

    public void setTipoInteres(double tipoInteres) {
        if(tipoInteres >= 0 && tipoInteres <= 10){
            this.tipoInteres = tipoInteres;
        } else {
            System.out.println("El tipo de interes deber estar entre el 0% y el 10%");
        }
    }
    
    // TODO: Aquí va el código de la clase CuentaBancaria
}
