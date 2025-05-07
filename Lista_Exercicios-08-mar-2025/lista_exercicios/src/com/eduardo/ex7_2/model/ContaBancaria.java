package com.eduardo.ex7_2.model;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor, String nomeThread) {
        try {
            if (valor <= 0) {
                System.out.println(nomeThread + " tentou depositar valor inválido: R$" + valor);
                return;
            }
            saldo += valor;
            System.out.println(nomeThread + " depositou: R$" + valor + " | Saldo atual: R$" + saldo);
            notifyAll(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public synchronized void sacar(double valor, String nomeThread) {
        try {
            while (valor > saldo || valor <= 0) {
                if (valor <= 0) {
                    System.out.println(nomeThread + " tentou sacar valor inválido: R$" + valor);
                    return;
                }
                System.out.println(nomeThread + " tentou sacar R$" + valor + " | Saldo insuficiente: R$" + saldo + " | Aguardando...");
                wait(); 
            }
            saldo -= valor;
            System.out.println(nomeThread + " sacou: R$" + valor + " | Saldo atual: R$" + saldo);
            notifyAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public double getSaldo() {
        return saldo;
    }
}