package com.edson.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("confira de o modelo tucson esta no dicionrio: " + carrosPopulares.containsKey("tucson"));

        System.out.println("exibe o consulmo do uno: " + carrosPopulares.get("uno"));

        System.out.println("exibe os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("exibe os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("exibe o modelo mais economico e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entrada : entradas) {
            if (entrada.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entrada.getKey();
                System.out.println("modelo mais eficiente " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("exibe o modelo menos eficiente");

        Double consumosMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entrada : carrosPopulares.entrySet()) {
            if (entrada.getValue().equals(consumosMenosEficiente)) {
                modeloMenosEficiente = entrada.getKey();
                System.out.println("modelos menos eficiente " + modeloMenosEficiente + " - " + consumosMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nexibe a soma dos consumos: " + soma);

        System.out.println("exibe a media dos consumos " + soma / carrosPopulares.size());

        System.out.println(carrosPopulares);
        System.out.println("\nremove os modelos com o consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }

        System.out.println(carrosPopulares);

        System.out.println("exibe todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println("exibe o dicionario ordenado pelo modelo");

        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2.toString());

        System.out.println("apague o dicionario de carros");
        carrosPopulares.clear();

        System.out.println("confere se o dicionario está vazio: "+ carrosPopulares.isEmpty());

    }
}
