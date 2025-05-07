package com.eduardo.ex6.model;

import java.util.List;

public class VerificaDuplicado {
    public static void verificar(List<Integer> numeros) throws Exception {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    throw new Exception("Número duplicado detectado: " + numeros.get(i));
                }
            }
        }
    }
}
