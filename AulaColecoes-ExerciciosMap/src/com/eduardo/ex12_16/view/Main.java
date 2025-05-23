package com.eduardo.ex12_16.view;

import com.eduardo.ex12_16.model.ListaDePalavras;

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
        
        System.out.println("Contém 'vermelho'? " + lista.contem("vermelho"));
        System.out.println("Contém 'amarelo'? " + lista.contem("amarelo"));
    }
}