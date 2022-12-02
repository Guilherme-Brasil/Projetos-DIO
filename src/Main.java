import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("Engenharia de Software");
    curso1.setDescricao("Cadeira do 6º Semestre");
    curso1.setCargaHoraria(96);

    Curso curso2 = new Curso();
    curso2.setTitulo("Redes");
    curso2.setDescricao("Cadeira do 6º Semestre");
    curso2.setCargaHoraria(96);

    Conteudo conteudo = new Curso(); // Polimorfismo

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria UML");
    mentoria.setDescricao("Diagramas");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    }
}
