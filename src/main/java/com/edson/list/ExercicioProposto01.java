package com.edson.list;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("digite uma temperatura");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }

        //exibindo todas as temperaturas:
        System.out.println("todas as temperaturas");
        System.out.println(temperaturas);

        //calculando e exibindo a média das temperaturas:
        double soma = 0d;
        for (double t : temperaturas) {
            soma = soma + t;
        }
        double media = soma / temperaturas.size();
        System.out.println("media " + media);

        //exibindo as temperaturas acima da média
        List<Double> temperaturasAcima = new ArrayList<>();
        for (double t : temperaturas) {
            if(t > media) {
                temperaturasAcima.add(t);
            }
        }
        System.out.println("temperatura acima: "+temperaturasAcima);

        //exibindo o mês das temperaturas acima da média por extenso:
//        int i=0;
        for (double t : temperaturas) {
            int index = temperaturas.indexOf(t);
            if(t > media) {
                switch (index){
                    case (0):
                        System.out.println("1 - janeiro: "+t);
                        break;
                    case(1):
                        System.out.println("2 - fevereiro: "+t);
                        break;
                    case(2):
                        System.out.println("3 - março: "+t);
                        break;
                    case(3):
                        System.out.println("4 - abril: "+t);
                        break;
                    case(4):
                        System.out.println("5 - maio: "+t);
                        break;
                    case(5):
                        System.out.println("6 - junho: "+t);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da media");
                }
            }
//            i++;
        }
    }
}