package com.edson.list;
/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        List<String> perguntas = new ArrayList<>() {{
            add("Telefonou para a vitima?");
            add("Esteve no local do crime?");
            add("Mora perto da vitima?");
            add("Devia para a vitima?");
            add("Ja trabalhou com a vitima?");
        }};

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine();
            respostas.add(resposta.toLowerCase());
        }

        int cont = 0;
        for (String resposta : respostas) {
            if (resposta.contains("s")) {
                cont++;
            }
        }
        switch (cont) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
}
