package com.eduardo.ex2.model;

public class VerificaNum {
    public static void verificarNumeroPar(int numero) throws Exception {
        if (numero % 2 != 0) {
            throw new Exception("Número ímpar detectado: " + numero);
        }
    }
}
