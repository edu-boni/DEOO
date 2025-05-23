package com.eduardo.ex12_27.view;

import com.eduardo.ex12_27.model.MaquinaDeKaraoke;

public class Main {
    public static void main(String[] args) {
        
        MaquinaDeKaraoke karaoke = new MaquinaDeKaraoke();
        
        karaoke.adicionarMusica("I Wanna Be Your Slave");
        karaoke.adicionarMusica("Beggin'");
        karaoke.adicionarMusica("Zitti e Buoni");
        karaoke.adicionarMusica("MAMMAMIA");
        
        karaoke.listarFila();
        
        System.out.println("\nAdiantando 'Zitti e Buoni':");
        karaoke.adianta("Zitti e Buoni");
        karaoke.listarFila();
        
        System.out.println("\nAdiando 'Beggin'':");
        karaoke.adia("Beggin'");
        karaoke.listarFila();
        
        System.out.println("\nTentando adiantar a primeira música 'I Wanna Be Your Slave' (não deve mudar):");
        karaoke.adianta("I Wanna Be Your Slave");
        karaoke.listarFila();
        
        System.out.println("\nTentando adiar a última música 'MAMMAMIA' (não deve mudar):");
        karaoke.adia("MAMMAMIA");
        karaoke.listarFila();
    }
}