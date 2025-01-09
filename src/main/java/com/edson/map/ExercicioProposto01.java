package com.edson.map;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("\ncria um dicionario que relaciona os estados e suas respectivas população");
        Map<String, Integer> populacaoEsdosNE = new HashMap<>() {{
            put("PE", 9611621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEsdosNE);

        System.out.println("\nsubsyitui a população do estado RN por 3.534.165");
        populacaoEsdosNE.put("RN", 3534165);
        System.out.println(populacaoEsdosNE);

        System.out.println("\nconfira se os estados da Paraiba (PB) estao no dicionario, caso não, adicione PB com a população de 4.039.277");
        populacaoEsdosNE.put("PB", 4039277);
        System.out.println(populacaoEsdosNE);

        System.out.println("\nexibe a populaçã do estado PE: " + populacaoEsdosNE.get("PE"));

        System.out.println("\nexibe todos os estados e suas populações na ordem que forma informados ");
        Map<String, Integer> populacaoEsdosNE1 = new LinkedHashMap<>() {{
            put("PE", 9611621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEsdosNE1);

        System.out.println("\nexibe todos os estados e suas populações na ordem alfabetica: ");
        Map<String, Integer> populacaoEsdosNE2 = new TreeMap<>(populacaoEsdosNE1);
        System.out.println(populacaoEsdosNE2);

        Collection<Integer> populacao = populacaoEsdosNE.values();
        String estadosMaiorPopulacao = "";
        String estadosMenorPopulacao = "";
        for (Map.Entry<String, Integer> estado : populacaoEsdosNE.entrySet()) {
            if (estadosMaiorPopulacao.isEmpty() || estado.getValue() > populacaoEsdosNE.get(estadosMaiorPopulacao)) {
                estadosMaiorPopulacao = estado.getKey();
            }
            if (estadosMenorPopulacao.isEmpty() || estado.getValue() < populacaoEsdosNE.get(estadosMenorPopulacao)) {
                estadosMenorPopulacao = estado.getKey();
            }
        }
        System.out.printf("\n\nexibe o estado com menor população (%s) e o estado com menor população (%s): ", estadosMenorPopulacao, Collections.min(populacao));
        System.out.printf("\n\nexibe o estado com maior população (%s) e o estado com menor população (%s): ", estadosMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEsdosNE.values().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            soma += next;
        }
        System.out.println("\n\nexibe a soma da população desses estados: " + soma);

        System.out.println("\n\nexibe a media da população desses estados: " + soma / populacaoEsdosNE.size());

        int soma2 = 0;
        for (Integer populacao1 : populacaoEsdosNE.values()) {
            soma2 += populacao1;
        }
        System.out.println("\n\nexibe a soma da população desses estados: " + soma2);
    }
}
