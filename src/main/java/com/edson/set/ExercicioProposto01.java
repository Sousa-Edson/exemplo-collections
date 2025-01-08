package com.edson.set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
//        a) Exiba todas as cores o arco-íris uma abaixo da outra;
        Set<String> cores = new HashSet<>(Arrays.asList("azul", "vermelho", "verde"));
        for (String cor : cores) {
            System.out.println(cor);
        }
//        b) A quantidade de cores que o arco-íris tem;
        System.out.println("quantidade de cores " + cores.size());

//        c) Exiba as cores em ordem alfabética;
        Set<String> ordem = new TreeSet<>(cores);
        System.out.println("cores em ordem alfabética " + ordem);

//        d) Exiba as cores na ordem inversa da que foi informada;
        Set<String> ordemInversa = new TreeSet<>(Collections.reverseOrder());
        ordemInversa.addAll(cores);
        System.out.println("cores em ordem inversa " + ordemInversa);

//        e) Exiba todas as cores que começam com a letra ”v”;
        for (String cor : cores) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }
//        f) Remova todas as cores que não começam com a letra “v”;
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            if (!cor.startsWith("v")) {
                iterator.remove();
            }
        }
        System.out.println("cores que começam com a letra “v” " + cores);

//        g) Limpe o conjunto;
        cores.clear();

//        h) Confira se o conjunto está vazio;
        System.out.println("cores esta vazia " + cores.isEmpty());
    }
}
