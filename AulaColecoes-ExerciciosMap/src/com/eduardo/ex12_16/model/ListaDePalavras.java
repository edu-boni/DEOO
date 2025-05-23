package com.eduardo.ex12_16.model;

import java.util.HashMap;
import java.util.Map;

public class ListaDePalavras {
    
    private Map<String, Integer> lista;
    
    public ListaDePalavras() {
        lista = new HashMap<>();
    }
    
    public void adicionar(String palavra) {
        if (contem(palavra)) {
            int aux = lista.get(palavra);
            lista.put(palavra, aux + 1);
        } else {
            lista.put(palavra, 1);
        }
    }
    
    public boolean contem(String palavra) {
        return lista.containsKey(palavra);
    }
    
    @Override
    public String toString() {
        return lista.keySet().toString();
    }
}
