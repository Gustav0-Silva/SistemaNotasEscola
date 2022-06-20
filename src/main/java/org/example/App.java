package org.example;
import AdicionarNotas.AdicionarNotaPrincipal;
import CadastroDeAlunos.RecebeDadosAluno;
import ExibirNotas.Exemplos;
import ExibirNotas.ExibirNotasPrincipal;

import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Exemplos.CadastrarExemplos();

        boolean ciclo = true;
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println("Bem vindo ao sistema de administração de alunos de Hogwarts!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Cadastrar nota");
            System.out.println("3 - Exibir boletins");
            System.out.println("4 - Sair do sistema");
            String action = sc.nextLine();

            switch (action){
                case "1":
                    RecebeDadosAluno receberDados = new RecebeDadosAluno();
                    receberDados.execute(sc);
                    break;
                case "2":
                    AdicionarNotaPrincipal notas = new AdicionarNotaPrincipal();
                    notas.execute(sc);
                    break;
                case "3":
                    ExibirNotasPrincipal exibir = new ExibirNotasPrincipal();
                    exibir.execute(sc);
                    break;
                case "4":
                    System.out.println("Saindo do sistema...");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    System.out.println();
            }
        }while (ciclo);
    }
}
