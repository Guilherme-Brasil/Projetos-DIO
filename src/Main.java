import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("Java");
    curso1.setDescricao("POO");
    curso1.setCargaHoraria(96);

    Curso curso2 = new Curso();
    curso2.setTitulo("JS");
    curso2.setDescricao("Web");
    curso2.setCargaHoraria(96);

    Conteudo conteudo = new Curso(); // Polimorfismo
    Conteudo conteudo1 = new Mentoria(); // Polimorfismo
    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Java Beginners");
    mentoria.setDescricao("First Meet");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    }
}
