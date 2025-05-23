package com.eduardo.ex6.view;

import java.util.ArrayList;

import com.eduardo.ex6.model.VerificaDuplicado;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(3); // duplicado

        try {
            VerificaDuplicado.verificar(numeros);
            System.out.println("Nenhum número duplicado encontrado.");
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
