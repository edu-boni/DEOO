package com.eduardo.ex12_23.model;

import java.util.LinkedList;
import java.util.Queue;

public class MaquinaDeKaraoke {
 private Queue<String> filaDeMusicas;
    
    public MaquinaDeKaraoke() {
        filaDeMusicas = new LinkedList<>();
    }

    public void adicionarMusica(String musica) {
        filaDeMusicas.add(musica);
    }

    public void listarFila() {
        if (filaDeMusicas.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila de músicas:");
            for (String musica : filaDeMusicas) {
                System.out.println("- " + musica);
            }
        }
    }

    public void tocarMusica() {
        if (filaDeMusicas.isEmpty()) {
            System.out.println("Não há músicas na fila para tocar.");
        } else {
            String musica = filaDeMusicas.poll();
            System.out.println("Tocando: " + musica);
        }
    }
}
