import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        //Polimorfismo "tudo que tenho em conteudo esta em curso MAS nem tudo q esta em curso esta no conteudo"
        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArtur = new Dev();
        devArtur.setNome("Artur");
        devArtur.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devArtur .getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devArtur .getConteudosConcluidos());
        devArtur.progredir();
        devArtur.progredir();
        System.out.println("Conteudos concluidos" + devArtur .getConteudosConcluidos());
        System.out.println("XP: " + devArtur.calcularToralXp());

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devDiego .getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devDiego .getConteudosConcluidos());
        devDiego.progredir();
        System.out.println("Conteudos concluidos" + devDiego .getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularToralXp());


    }
}
