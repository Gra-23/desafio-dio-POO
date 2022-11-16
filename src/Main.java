import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
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


        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos André:" + devAndre.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());
    }
}