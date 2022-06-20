package ExibirNotas;

import ExibirNotas.ActionsBoletim.EnviarNotaCoruja;
import ExibirNotas.ActionsBoletim.EnviarNotaEmail;
import ExibirNotas.ActionsBoletim.EnviarNotaMsg;
import ExibirNotas.ActionsBoletim.ImprimirBoletim;
import Objects.Database;
import Objects.InfosNota;
import UtilsGerais.ExisteAluno;

import java.util.Collections;
import java.util.Scanner;

public class ExibirBoletim extends Database {
    public void execute(Scanner sc){
        System.out.println("Por favor, digite o nome do aluno: ");
        String aluno = sc.nextLine();

        if (!ExisteAluno.execute(aluno)){
            return;
        }
        exibir(aluno);

        System.out.println("Selecione o que deseja fazer: ");
        System.out.println("1 - Enviar boletim por email");
        System.out.println("2 - Enviar boletim por mensagem");
        System.out.println("3 - Imprimir boletim");
        System.out.println("4 - Enviar por coruja");
        System.out.println("0 - Sair");
        String action = sc.nextLine();

        switch (action){
            case "1":
                EnviarNotaEmail.execute(aluno);
                break;
            case "2":
                EnviarNotaMsg.execute(aluno);
                break;
            case "3":
                ImprimirBoletim.execute(aluno);
                break;
            case "4":
                EnviarNotaCoruja.execute(aluno);
                break;
            default:
                System.out.println("Informação inválida, redirecionando para menu principal");
        }
    }

    private void exibir(String nome){
        Collections.sort(notasList);

        System.out.println("Nome do aluno: " + nome);
        for (InfosNota nota:notasList) {
            if (nota.getAluno().getNomeAluno().equals(nome)){
                System.out.println("--Matéria: " + nota.getMateria());
                System.out.println("--Semestre: " + nota.getSemestre());
                System.out.println("--Nota: " + nota.getNota());
                System.out.println("------------------------");
            }
        }
    }
}
