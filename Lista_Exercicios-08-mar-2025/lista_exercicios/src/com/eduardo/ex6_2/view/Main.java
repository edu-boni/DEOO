package com.eduardo.ex6_2.view;
import com.eduardo.ex6_2.model.ComparaArquivo;
public class Main {
    public static void main(String[] args) {
        String caminhoArquivo1 = "src/com/eduardo/ex6_2/Arquivo1.txt"; 
        String caminhoArquivo2 = "src/com/eduardo/ex6_2/Arquivo2.txt"; 

            int resultado = ComparaArquivo.compararArquivos(caminhoArquivo1, caminhoArquivo2);
            if (resultado < 0) {
                System.out.println("Arquivo 1 vem antes do Arquivo 2 lexicograficamente.");
            } else if (resultado > 0) {
                System.out.println("Arquivo 2 vem antes do Arquivo 1 lexicograficamente.");
            } else {
                System.out.println("Os arquivos são idênticos.");
            }
        }
}
