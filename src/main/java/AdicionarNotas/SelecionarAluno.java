package AdicionarNotas;

import UtilsGerais.ExisteAluno;

import java.util.Scanner;

public class SelecionarAluno {
    public static String execute(Scanner sc){
        System.out.println("Por favor, digite o nome do aluno: ");
        String aluno = sc.nextLine();

        if (!ExisteAluno.execute(aluno)){
            return "0";
        }else {
            return aluno;
        }
    }
}
