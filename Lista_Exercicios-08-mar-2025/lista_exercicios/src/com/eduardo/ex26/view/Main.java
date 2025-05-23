package com.eduardo.ex26.view;
import com.eduardo.ex26.model.ValidaHexadecimal;

public class Main {
    public static void main(String[] args) {
        String[] codigos_hexa = {
            "0x1A3F",
            "0Xabcd",
            "123ABC",
            "0x",
            "0xZ12",
            "0x123g",
            "0xFFEE"
        };

        for (String str : codigos_hexa) {
            boolean valido = ValidaHexadecimal.hexadecimalValido(str);
            System.out.println(str + " -> " + (valido ? "Válido" : "Inválido"));
        }
    }
}
