package com.eduardo.ex2.view;

import com.eduardo.ex2.model.VerificaNum;

public class Main {
    public static void main(String[] args) {
        try {
            VerificaNum.verificarNumeroPar(4);
            System.out.println("Número par: 10");
            VerificaNum.verificarNumeroPar(7);
            System.out.println("Número par: 7");
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
