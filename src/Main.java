import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
//    public static void main(String[] args) {
//        Curso curso = new Curso();
//        curso.setTitulo("curso java");
//        curso.setDescricao("Descrição curso Java");
//        curso.setCargaHoraria(8);
//
//        Curso curso2 = new Curso();
//        curso2.setTitulo("curso javaScript");
//        curso2.setDescricao("Descrição curso JavaScript");
//        curso2.setCargaHoraria(6);
//
//        //Polimorfismo "tudo que tenho em conteudo esta em curso MAS nem tudo q esta em curso esta no conteudo"
//        //Conteudo conteudo = new Curso();
//
//        Mentoria mentoria = new Mentoria();
//        mentoria.setTitulo("mentoria de java");
//        mentoria.setDescricao("descrição mentoria java");
//        mentoria.setData(LocalDate.now());
//
////        System.out.println(curso);
////        System.out.println(curso2);
////        System.out.println(mentoria);
//
//
//        Bootcamp bootcamp = new Bootcamp();
//        bootcamp.setNome("Bootcamp Java Developer");
//        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
//        bootcamp.getConteudos().add(curso);
//        bootcamp.getConteudos().add(curso2);
//        bootcamp.getConteudos().add(mentoria);
//
//        Dev devArtur = new Dev();
//        devArtur.setNome("Artur");
//        devArtur.inscreverBootCamp(bootcamp);
//        System.out.println("Conteudos Inscritos" + devArtur .getConteudosInscritos());
//        System.out.println("Conteudos concluidos" + devArtur .getConteudosConcluidos());
//        devArtur.progredir();
//        devArtur.progredir();
//        System.out.println("Conteudos concluidos" + devArtur .getConteudosConcluidos());
//        System.out.println("XP: " + devArtur.calcularToralXp());
//
//        Dev devDiego = new Dev();
//        devDiego.setNome("Diego");
//        devDiego.inscreverBootCamp(bootcamp);
//        System.out.println("Conteudos Inscritos" + devDiego .getConteudosInscritos());
//        System.out.println("Conteudos concluidos" + devDiego .getConteudosConcluidos());
//        devDiego.progredir();
//        System.out.println("Conteudos concluidos" + devDiego .getConteudosConcluidos());
//        System.out.println("XP: " + devDiego.calcularToralXp());
//
//
//    }

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // ===== Conteúdos =====
    Curso cursoJava = new Curso();
    cursoJava.setTitulo("Curso Java");
    cursoJava.setDescricao("Descrição curso Java");
    cursoJava.setCargaHoraria(8);

    Curso cursoJS = new Curso();
    cursoJS.setTitulo("Curso JavaScript");
    cursoJS.setDescricao("Descrição curso JavaScript");
    cursoJS.setCargaHoraria(6);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Descrição mentoria Java");
    mentoria.setData(LocalDate.now());

    // ===== Bootcamp =====
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(cursoJava);
    bootcamp.getConteudos().add(cursoJS);
    bootcamp.getConteudos().add(mentoria);

    // ===== Dev =====
    System.out.print("Digite o nome do Dev: ");
    String nomeDev = scanner.nextLine();

    Dev dev = new Dev();
    dev.setNome(nomeDev);
    dev.inscreverBootCamp(bootcamp);

    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Ver conteúdos inscritos");
        System.out.println("2 - Progredir");
        System.out.println("3 - Ver conteúdos concluídos");
        System.out.println("4 - Ver XP total");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Conteúdos Inscritos:");
                dev.getConteudosInscritos().forEach(System.out::println);
                break;

            case 2:
                if (dev.getConteudosInscritos().isEmpty()) {
                    System.out.println("Nenhum conteúdo para progredir.");
                } else {
                    dev.progredir();
                    System.out.println("Progresso realizado com sucesso!");
                }
                break;

            case 3:
                System.out.println("Conteúdos Concluídos:");
                dev.getConteudosConcluidos().forEach(System.out::println);
                break;

            case 4:
                System.out.println("XP Total: " + dev.calcularToralXp());
                break;

            case 0:
                System.out.println("Saindo... Até mais, " + dev.getNome() + "!");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    scanner.close();
}

}