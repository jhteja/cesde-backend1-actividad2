package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    public CuentaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            saldo = 0; // Si el saldo es negativo, se establece en 0
        }
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo; // Solo se actualiza si el saldo es no negativo
        }
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad; // Solo se deposita si la cantidad es positiva
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad; // Solo se retira si la cantidad es positiva y no excede el saldo
        }else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes para retirar " + cantidad);
        }
    }  
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    } 
}
