package com.edson.paraSaberMais;

import java.util.Objects;

//Crie uma classe Curso que possua os atributos: Disciplina, duracao
public class Disciplina implements Comparable<Disciplina> {
    private String disciplina;
    private Integer duracao;

    public Disciplina(String disciplina, Integer duracao) {
        this.disciplina = disciplina;
        this.duracao = duracao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "disciplina='" + disciplina + '\'' +
                ", duracao='" + duracao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(disciplina, that.disciplina) && Objects.equals(duracao, that.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, duracao);
    }

    @Override
    public int compareTo(Disciplina o) {
        return 0;
    }
}
