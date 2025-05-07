package com.eduardo.ex18.view;

import com.eduardo.ex18.model.EncontraPalavra;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/com/eduardo/ex18/Arquivo1.txt";
        
        String palavraMaisLonga = EncontraPalavra.encontrarPalavraMaisLonga(caminhoArquivo);
        
        if (palavraMaisLonga.isEmpty()) {
            System.out.println("Nenhuma palavra encontrada (arquivo vazio ou erro).");
        } else {
            System.out.println("A palavra mais longa é: " + palavraMaisLonga + " (tamanho: " + palavraMaisLonga.length() + ")");
        }
    }
}
