package com.eduardo.ex7_2.view;

import com.eduardo.ex7_2.model.ContaBancaria;
import com.eduardo.ex7_2.model.Deposito;
import com.eduardo.ex7_2.model.Saque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        ExecutorService executorThreads = Executors.newCachedThreadPool();

        executorThreads.execute(new Deposito(conta, 500.0, 500, "Thread-Depósito-1"));
        executorThreads.execute(new Saque(conta, 300.0, 1000, "Thread-Saque-1"));
        executorThreads.execute(new Deposito(conta, 200.0, 1500, "Thread-Depósito-2"));
        executorThreads.execute(new Saque(conta, 700.0, 2000, "Thread-Saque-2"));
        executorThreads.execute(new Deposito(conta, 1000.0, 2500, "Thread-Depósito-3"));
        executorThreads.execute(new Saque(conta, 1500.0, 3000, "Thread-Saque-3"));

        executorThreads.shutdown();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}