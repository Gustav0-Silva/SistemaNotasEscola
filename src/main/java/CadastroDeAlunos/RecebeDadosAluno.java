package CadastroDeAlunos;

import Factory.AlunoFactory;
import UtilsGerais.ValidaCasa;

import java.util.Scanner;

public class RecebeDadosAluno {
    public void execute(Scanner sc){
        boolean ciclo;
        String telefone;
        String casa;

        System.out.println("Bem vindo ao cadastro de alunos, por favor, digite as informações solicitadas");
        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();

        do {
            System.out.println("Telefone do responsável (apenas números): ");
            telefone = sc.nextLine();
            ciclo = UtilsValidaTelefone.execute(telefone);
        }while (!ciclo);

        ciclo = false;
        System.out.println("E-mail do responsável: ");
        String email = sc.nextLine();

        do {
            System.out.println("Digite o número correspondente a casa do aluno: ");
            System.out.println("1 - Sonserina");
            System.out.println("2 - Grifinória");
            System.out.println("3 - Lufa-Lufa");
            System.out.println("4 - Corvinal");
            casa = sc.nextLine();
            ciclo = ValidaCasa.execute(casa);
        }while (!ciclo);

        AlunoFactory.execute(nome,telefone,email,casa);

    }

}
