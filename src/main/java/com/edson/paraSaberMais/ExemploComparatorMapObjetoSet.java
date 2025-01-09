package com.edson.paraSaberMais;

import java.util.*;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com o seguintes requisito:
Key: Nome do aluno e matrícula - Value: Nome das disciplinas na qual estão matriculados
*/
public class ExemploComparatorMapObjetoSet {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Edson", 123);
        Aluno aluno2 = new Aluno("Fernando", 558);
        Aluno aluno3 = new Aluno("Maria", 456);

        Disciplina disciplina1 = new Disciplina("Java", 10);
        Disciplina disciplina2 = new Disciplina("C++", 20);
        Disciplina disciplina3 = new Disciplina("Python", 30);

        Set<Disciplina> disciplinas1 = new HashSet<Disciplina>(Arrays.asList(disciplina1, disciplina2));
        Set<Disciplina> disciplinas2 = new HashSet<Disciplina>(Arrays.asList(disciplina2, disciplina3));
        Set<Disciplina> disciplinas3 = new HashSet<Disciplina>(Arrays.asList(disciplina1, disciplina3));

        Map<Aluno, Set<Disciplina>> alunosDisciplinas = new HashMap<Aluno, Set<Disciplina>>() {{
            put(aluno1, disciplinas1);
            put(aluno2, disciplinas2);
            put(aluno3, disciplinas3);
        }};
        System.out.println("\nexibindo dicionario");


    }
}