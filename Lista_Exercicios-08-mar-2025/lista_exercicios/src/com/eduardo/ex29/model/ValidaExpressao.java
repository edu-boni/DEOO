package com.eduardo.ex29.model;

public class ValidaExpressao {
    public static boolean expressaoValida(String str) {
        return str.matches("^[0-9+\\-*/()\\s]+$");
    }
}
