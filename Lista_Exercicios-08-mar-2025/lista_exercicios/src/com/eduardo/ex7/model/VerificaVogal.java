package com.eduardo.ex7.model;

public class VerificaVogal {
    public static void verificar(String string) throws Exception {
        String minusculo = string.toLowerCase();
        if (!(minusculo.contains("a") || minusculo.contains("e") || minusculo.contains("i") || minusculo.contains("o") || minusculo.contains("u"))) {
            throw new Exception("A string não contém vogais.");
        }
    }
}
