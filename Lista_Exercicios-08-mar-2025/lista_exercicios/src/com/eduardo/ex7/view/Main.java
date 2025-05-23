package com.eduardo.ex7.view;

import com.eduardo.ex7.model.VerificaVogal;

public class Main {
    public static void main(String[] args) {
        String entrada = "ffffgggg"; // sem vogal nenhuma

        try {
            VerificaVogal.verificar(entrada);
            System.out.println("A string contém pelo menos uma vogal.");
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
