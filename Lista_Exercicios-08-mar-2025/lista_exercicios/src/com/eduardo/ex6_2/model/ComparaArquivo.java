package com.eduardo.ex6_2.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ComparaArquivo {
    public static int compararArquivos(String caminhoArquivo1, String caminhoArquivo2) {
        File arq1 = new File(caminhoArquivo1);
        File arq2 = new File(caminhoArquivo2);

        try {
            if (!arq1.exists() || !arq2.exists()) {
                throw new IOException("Um ou ambos os arquivos não existem.");
            }

            try (BufferedReader br1 = new BufferedReader(new FileReader(arq1)); 
                 BufferedReader br2 = new BufferedReader(new FileReader(arq2))) {

                String linha1, linha2 = null;
                while ((linha1 = br1.readLine()) != null && (linha2 = br2.readLine()) != null) {
                    int resultadoComparacao = linha1.compareTo(linha2);
                    if (resultadoComparacao != 0) {
                        return resultadoComparacao;
                    }
                }

                if (linha1 == null && linha2 == null) {
                    return 0; // identicos
                } else if (linha1 == null) {
                    return -1; //arq1 terminou antes
                } else {
                    return 1; //arq2 terminou antes
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os arquivos: " + e.getMessage());
            return -2; // erro de leitura
        }
    }
}
