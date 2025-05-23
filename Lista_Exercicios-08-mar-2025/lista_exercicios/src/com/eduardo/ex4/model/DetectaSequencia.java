package com.eduardo.ex4.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class DetectaSequencia {
    public static ArrayList<String> encontrarSequencias(String str) {
        ArrayList<String> resultados = new ArrayList<>();
        Pattern padrao = Pattern.compile("\\b[A-Z][a-z]+\\b");
        Matcher detectar = padrao.matcher(str);

        while (detectar.find()) {
            resultados.add(detectar.group());
        }

        return resultados;
    }
}
