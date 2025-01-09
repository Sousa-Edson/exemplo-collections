package com.edson.paraSaberMais;

import java.util.*;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
*/
public class ExemploComparatorMapObjetoObjeto {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Edson", 123);
        Aluno aluno2 = new Aluno("Fernando", 558);
        Aluno aluno3 = new Aluno("Maria", 456);

        Disciplina disciplina1 = new Disciplina("Java", 10);
        Disciplina disciplina2 = new Disciplina("C++", 20);
        Disciplina disciplina3 = new Disciplina("Python", 30);

        Map<Disciplina, Aluno> cursos = new HashMap<>() {{
            put(disciplina1, aluno1);
            put(disciplina2, aluno2);
            put(disciplina3, aluno3);
        }};
        System.out.println("\nexibindo dicionario");
        for (Map.Entry<Disciplina, Aluno> curso : cursos.entrySet()) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\nnome disciplina");
        Map<Disciplina, Aluno> cursos1 = new TreeMap<Disciplina, Aluno>(cursos);
        for (Map.Entry<Disciplina, Aluno> curso : cursos1.entrySet()) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\nduração disciplina");
        Map<Disciplina, Aluno> cursos2 = new TreeMap<Disciplina, Aluno>(new ComparatorDuracaoDisciplina());
        cursos2.putAll(cursos);
        for (Map.Entry<Disciplina, Aluno> curso : cursos2.entrySet()) {
            System.out.println(curso.getKey() + " - " + curso.getValue());
        }

        System.out.println("\nnome do aluno");
        Set<Map.Entry<Disciplina, Aluno>> alunos = new TreeSet<Map.Entry<Disciplina, Aluno>>(new ComparatorNomeAluno());
        alunos.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> aluno : alunos) {
            System.out.println(aluno.getKey() + " - " + aluno.getValue());
        }

        System.out.println("\nmatricula do aluno");
        Set<Map.Entry<Disciplina, Aluno>> alunos1 = new TreeSet<Map.Entry<Disciplina, Aluno>>(new ComparatorMatriculaAluno());
        alunos1.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> aluno : alunos1) {
            System.out.println(aluno.getKey() + " - " + aluno.getValue());
        }

    }
}

class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {

    @Override
    public int compare(Disciplina d1, Disciplina d2) {
        return Integer.compare(d1.getDuracao(), d2.getDuracao());
    }
}

class ComparatorNomeAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Map.Entry<Disciplina, Aluno> a1, Map.Entry<Disciplina, Aluno> a2) {
        return a1.getValue().getNome().compareToIgnoreCase(a2.getValue().getNome());
    }
}

class ComparatorMatriculaAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Map.Entry<Disciplina, Aluno> o1, Map.Entry<Disciplina, Aluno> o2) {
        return Integer.compare(o1.getValue().getMatricula(), o2.getValue().getMatricula());
    }
}