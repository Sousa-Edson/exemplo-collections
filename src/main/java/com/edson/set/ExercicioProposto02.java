package com.edson.set;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFavoritas = new HashSet<>() {{
            add(new LinguagemFavorita("Java", 1940, "Eclipse"));
            add(new LinguagemFavorita("Javascript", 1980, "VsCode"));
            add(new LinguagemFavorita("Pyton", 1960, "Eclipse"));
        }};

//    a) Ordem de inserção;
        System.out.println("\n#ordem de inserção ");
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas) {
            System.out.println(linguagemFavorita);
        }
//    b) Ordem natural(nome);
        System.out.println("\n#ordem natural(nome) ");
        Set<LinguagemFavorita> linguagemFavoritas1 = new TreeSet<>(new ComparatorNome());
        linguagemFavoritas1.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas1) {
            System.out.println(linguagemFavorita.getNome());
        }

//    c) IDE;
        System.out.println("\n#ordem IDE ");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(new ComparatorIDE());
        linguagemFavoritas2.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas2) {
            System.out.println(linguagemFavorita.getIDE());
        }
//    d) Ano de criação e nome;
        System.out.println("\n#ordem ano de criaçõa e nome ");
        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComparatorAnoNome());
        linguagemFavoritas3.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas3) {
            System.out.println(linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getNome());
        }
//    e) Nome, ano de criação e IDE;
        System.out.println("\n#ordem nome,ano de criação e IDE ");
        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagemFavoritas4.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas4) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIDE());
        }
    }
}

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && Objects.equals(nome, that.nome) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" + "nome='" + nome + '\'' + ", anoDeCriacao=" + anoDeCriacao + ", IDE='" + IDE + '\'' + '}';
    }
}

class ComparatorNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIDE().compareTo(l2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;
        return l1.getNome().compareTo(l2.getNome());
    }
}

//    e) Nome, ano de criação e IDE;
class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {
    private Comparator<LinguagemFavorita> comparadorNome = new ComparatorNome();
    private Comparator<LinguagemFavorita> comparadorAnoNome = new ComparatorAnoNome();
    private Comparator<LinguagemFavorita> comparadorIDE = new ComparatorIDE();

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = comparadorNome.compare(l1, l2);
        if (nome != 0) return nome;
        int anoCriacao = comparadorAnoNome.compare(l1, l2);
        if (anoCriacao != 0) return anoCriacao;
        return comparadorIDE.compare(l1, l2);
    }
}