package com.eduardo.ex12_17.view;

import com.eduardo.ex12_17.model.ListaDePalavras;

public class Main {
    public static void main(String[] args) {
        
        ListaDePalavras lista = new ListaDePalavras();
        
        lista.adicionar("vermelho");
        lista.adicionar("azul");
        lista.adicionar("vermelho");
        lista.adicionar("verde");
        lista.adicionar("azul");
        lista.adicionar("azul");
        
        System.out.println(lista);
        
        System.out.println("Ocorrências de 'azul': " + lista.conta("azul"));
        System.out.println("Ocorrências de 'vermelho': " + lista.conta("vermelho"));
        System.out.println("Ocorrências de 'verde': " + lista.conta("verde"));
        System.out.println("Ocorrências de 'amarelo': " + lista.conta("amarelo"));
    }
}