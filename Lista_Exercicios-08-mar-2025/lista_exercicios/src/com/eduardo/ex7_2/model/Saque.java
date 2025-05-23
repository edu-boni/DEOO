package com.eduardo.ex7_2.model;

public class Saque implements Runnable {
    private ContaBancaria conta;
    private double valor;
    private int delay;
    private String nomeThread;

    public Saque(ContaBancaria conta, double valor, int delay, String nomeThread) {
        this.conta = conta;
        this.valor = valor;
        this.delay = delay;
        this.nomeThread = nomeThread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            conta.sacar(valor, nomeThread);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}