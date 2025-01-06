package com.edson.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("cria uma lista de doubles");

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("exibe a lista de notas");
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("substitui a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("exibe a terceira nota adicionada: " + notas.get(2));

        System.out.println("exiba a menor nota: " + Collections.min(notas));

        System.out.println("exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("exiba a soma das notas: " + soma);

        System.out.println("exiba a media das notas: " + (soma / notas.size()));

        System.out.println("remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

//        System.out.println("Remova todas as notas menores que 7.0");
//        notas.removeIf(nota -> nota < 7.0);
//        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println();

        System.out.println("confira se a lista esta vazia " + notas.isEmpty());
    }
}
