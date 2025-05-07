package com.eduardo.ex18.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EncontraPalavra {
 public static String encontrarPalavraMaisLonga(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        String palavraMaisLonga = "";

        try {
            if (!arquivo.exists()) {
                throw new IOException("O arquivo não existe: " + caminhoArquivo);
            }

            try (BufferedReader buffer = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = buffer.readLine()) != null) {
                    String[] palavras = linha.split("\\s+");
                    for (String palavra : palavras) {
                        palavra = palavra.replaceAll("[^a-zA-Z0-9]", "");
                        if (palavra.length() > palavraMaisLonga.length()) {
                            palavraMaisLonga = palavra;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return ""; 
        }

        return palavraMaisLonga;
    }
}
