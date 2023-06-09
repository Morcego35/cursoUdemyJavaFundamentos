package OrientacaoObjeto.composicao.MuitoPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>(); //final faz com que o end de memoria seja estatico

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                '}';
    }
    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
    Aluno(String nome){
        this.nome = nome;
    }
    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
