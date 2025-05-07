package com.eduardo.ex14.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeArquivo {
    public static String[] lerLinhas(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        ArrayList<String> linhas = new ArrayList<>();

        try {
            if (!arquivo.exists()) {
                throw new IOException("O arquivo não existe: " + caminhoArquivo);
            }

            try (BufferedReader buffer = new BufferedReader(new FileReader(arquivo))) {
                while (buffer.ready()) {
                    String linha = buffer.readLine();
                    if (linha != null) {
                        linhas.add(linha);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return new String[0];
        }

        return linhas.toArray(new String[0]);
    }
}
