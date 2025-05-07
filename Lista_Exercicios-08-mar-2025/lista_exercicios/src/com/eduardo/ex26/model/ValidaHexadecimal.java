package com.eduardo.ex26.model;

public class ValidaHexadecimal {
    public static boolean hexadecimalValido(String str) {
        return str.matches("^0[xX][0-9a-fA-F]+$");
    }
    
}
