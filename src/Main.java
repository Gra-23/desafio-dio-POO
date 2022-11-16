import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Básico");
        curso1.setDescricao("O Java é uma linguagem de programação orientada a objetos e é uma das linguagens mais utilizadas atualmente");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso MySQL");
        curso2.setDescricao("Aprendendo a usar um gerenciador de Banco de Dados");
        curso2.setCargaHoraria(24);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Collections");
        mentoria.setDescricao("Descrição mentoria Collections");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devGraciele = new Dev();
        devGraciele.setNome("Graciele");
        devGraciele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Graciele:" + devGraciele.getConteudosInscritos());
        devGraciele.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Graciele:" + devGraciele.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Graciele:" + devGraciele.getConteudosConcluidos());
        System.out.println("XP: " + devGraciele.calcularTotalXp());

        System.out.println("-------------------------------------------------------");

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos André:" + devAndre.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());
        System.out.println("XP: " + devAndre.calcularTotalXp());
    }
}