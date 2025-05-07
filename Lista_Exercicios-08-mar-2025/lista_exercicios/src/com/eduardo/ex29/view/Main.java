package com.eduardo.ex29.view;

import com.eduardo.ex29.model.ValidaExpressao;

public class Main {
    public static void main(String[] args) {
        String[] expressoes = {
            "2+2",
            "3 * (4 + 1)",
            "5 / 0",
            "10 - 7 * 2",
            "abc + 1",
            "2 + @",
            "7 + (6 - 3)"
        };

        for (String expressao : expressoes) {
            boolean valido = ValidaExpressao.expressaoValida(expressao);
            System.out.println(expressao + " -> " + (valido ? "Expressão válida" : "Expressão inválida"));
        }
    }
}
