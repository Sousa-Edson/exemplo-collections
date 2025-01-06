package com.edson.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamplo {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);

        System.out.println("exibe a lista de notas original "+notas);

        LinkedList<Double>notas2 = new LinkedList<>(notas);
        System.out.println("lista criada do arrayList: " + notas2);

        Double primeiraNota=notas2.peek();
        System.out.println("primeira nota: "+primeiraNota);

        Double primeiraNotaRemovida=notas2.poll();
        System.out.println("primeira nota removida: "+primeiraNotaRemovida);
        System.out.println("exibe a lista apos remoção "+notas2);
    }
}
