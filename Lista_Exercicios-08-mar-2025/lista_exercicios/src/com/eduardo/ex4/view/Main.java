package com.eduardo.ex4.view;

import java.util.ArrayList;

import com.eduardo.ex4.model.DetectaSequencia;

public class Main {
    public static void main(String[] args) {
        String str = "Estou estudando Exercicios de Java para a aula do professor Mario.";

        ArrayList<String> sequencias = DetectaSequencia.encontrarSequencias(str);

        if (sequencias.isEmpty()) {
            System.out.println("Nenhuma sequência encontrada.");
        } else {
            System.out.println("Sequências encontradas:");
            for (String s : sequencias) {
                System.out.println(s);
            }
        }
    } 
}
