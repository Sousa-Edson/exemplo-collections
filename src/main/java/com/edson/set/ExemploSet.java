package com.edson.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.5));
        System.out.println(notas.toString());

        System.out.println("confira se a nota 5.0 esta no conjunto " + notas.contains(5d));

        System.out.println("exibe a menor nota " + Collections.min(notas));

        System.out.println("exibe a maior nota " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exibe a soma dos valores " + soma);
        System.out.println("exibe a media das notas " + soma / notas.size());

        System.out.println("remoce a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("confere se esta vazio nota 1: "+notas.isEmpty());
        System.out.println("confere se esta vazio nota 2: "+notas2.isEmpty());
        System.out.println("confere se esta vazio nota 3: "+notas3.isEmpty());


    }
}
