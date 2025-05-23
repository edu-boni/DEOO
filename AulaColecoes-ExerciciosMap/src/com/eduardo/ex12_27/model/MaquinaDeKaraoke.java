package com.eduardo.ex12_27.model;

import java.util.LinkedList;
import java.util.List;
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
    
    public void adia(String musica) {
        List<String> lista = new LinkedList<>(filaDeMusicas);
        int index = lista.indexOf(musica);
        
        if (index != -1 && index < lista.size() - 1) {
            String temp = lista.get(index + 1);
            lista.set(index + 1, lista.get(index));
            lista.set(index, temp);
            
            filaDeMusicas = new LinkedList<>(lista);
        }
    }

    public void adianta(String musica) {
        List<String> lista = new LinkedList<>(filaDeMusicas);
        int index = lista.indexOf(musica);
        
        if (index > 0) {
            String temp = lista.get(index - 1);
            lista.set(index - 1, lista.get(index));
            lista.set(index, temp);

            filaDeMusicas = new LinkedList<>(lista);
        }
    }
}
