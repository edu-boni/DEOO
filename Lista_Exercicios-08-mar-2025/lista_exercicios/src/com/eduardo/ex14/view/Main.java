package com.eduardo.ex14.view;

import com.eduardo.ex14.model.LeArquivo;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/com/eduardo/ex14/Arquivo1.txt";
        
        String[] linhas = LeArquivo.lerLinhas(caminhoArquivo);
        
        if (linhas.length == 0) {
            System.out.println("Nenhuma linha lida (arquivo vazio ou erro).");
        } else {
            System.out.println("Conteúdo do arquivo armazenado no array:");
            for (int i = 0; i < linhas.length; i++) {
                System.out.println("Linha " + (i + 1) + ": " + linhas[i]);
            }
        }
    }
}
