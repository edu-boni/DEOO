package com.eduardo.ex12_23.view;

import com.eduardo.ex12_23.model.MaquinaDeKaraoke;

public class Main {
    public static void main(String[] args) {
        
        MaquinaDeKaraoke karaoke = new MaquinaDeKaraoke();
        
        karaoke.adicionarMusica("I Wanna Be Your Slave");
        karaoke.adicionarMusica("Beggin'");
        karaoke.adicionarMusica("Zitti e Buoni");
        
        karaoke.listarFila();
        
        karaoke.tocarMusica();
        karaoke.tocarMusica();
        
        karaoke.listarFila();
        
        karaoke.tocarMusica();
        karaoke.tocarMusica(); // fila vazia teste
    }
}