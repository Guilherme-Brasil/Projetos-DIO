import br.com.dio.desafio.dominio.*;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Description");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Guilherme");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
