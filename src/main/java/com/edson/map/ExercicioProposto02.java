package com.edson.map;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class ExercicioProposto02 {
    public static void main(String[] args) {
        int quantidadeLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < quantidadeLancamentos; i++) {
            valores.add(geradorDeLancamento.nextInt(6) + 1);
        }
        System.out.println(valores);

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado)) {
                lancamentos.put(resultado, lancamentos.get(resultado) + 1);
            } else {
                lancamentos.put(resultado, 1);
            }
        }

        System.out.println("jogando");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.println(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nvalor " + " quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%2d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
