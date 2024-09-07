package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
        // TODO: Adiciona aquí el código que deseas para la Cuenta Bancaria.
        CuentaBancaria cuenta = new CuentaBancaria("Wendy Fonseca","5072317169", 1850000.0);
        
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Wendy Fonseca"));
        
        cuenta.setTitular("Karen Tacuma");
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Karen Tacuma"));
        
        System.out.println("Prueba Numero de Cuenta: " + cuenta.getNumeroCuenta().equals("5072317196"));
        
        System.out.println("Prueba Saldo: "+ (cuenta.getSaldo() == 1780000.0));
        
        cuenta.ingresar(335000);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 3225000.0));
        
        cuenta.ingresar(-200000);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 3225000.0));
        
        cuenta.retirar(300000);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 2435000.0));
        
        cuenta.retirar(2000000);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 2435000.0));
        
        System.out.println("Calcular interes: " + (cuenta.calcularInteres() == 1876275.0));
        
        cuenta.setTipoInteres(5.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1432250.0));
        
        cuenta.setTipoInteres(-2.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1432250.0));
        
        cuenta.setTipoInteres(12.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1432250));
        
    }
}
