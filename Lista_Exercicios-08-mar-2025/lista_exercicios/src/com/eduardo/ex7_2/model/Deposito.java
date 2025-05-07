package com.eduardo.ex7_2.model;

public class Deposito implements Runnable {
    private ContaBancaria conta;
    private double valor;
    private int delay;
    private String nomeThread;

    public Deposito(ContaBancaria conta, double valor, int delay, String nomeThread) {
        this.conta = conta;
        this.valor = valor;
        this.delay = delay;
        this.nomeThread = nomeThread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay); 
            conta.depositar(valor, nomeThread);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}