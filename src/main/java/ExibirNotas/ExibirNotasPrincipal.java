package ExibirNotas;

import Objects.Materia;

import java.util.Scanner;

public class ExibirNotasPrincipal {
    public void execute (Scanner sc){
        System.out.println("Bem vindo ao método de exibição de notas");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Exibir notas de Poções de todos os alunos");
        System.out.println("2 - Exibir notas de Defesa C. A. das Trevas de todos os alunos");
        System.out.println("3 - Exibir notas de Herbologia de todos os alunos");
        System.out.println("4 - Exibir boletim de um aluno");
        System.out.println("0 - Sair do sistema");
        String action = sc.nextLine();

        switch (action){
            case "1":
                ExibirTodasNotas.execute(Materia.POTIONS);
                break;
            case "2":
                ExibirTodasNotas.execute(Materia.DEFENSE);
                break;
            case "3":
                ExibirTodasNotas.execute(Materia.HERBOLOGY);
                break;
            case "4":
                ExibirBoletim boletim = new ExibirBoletim();
                boletim.execute(sc);
                break;
            case "0":
                System.out.println("Saindo to modulo de exibir notas...");
                System.out.println();
                break;
            default:
                System.out.println("Opção inválida, tente novamente por favor");
                System.out.println();
                execute(sc);
        }
    }
}
