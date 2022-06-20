package UtilsGerais;

import Objects.Aluno;
import Objects.Database;

public class ExisteAluno extends Database {
    public static boolean execute(String nome){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                return true;
            }
        }
        System.out.println("Aluno informado não está cadatrado");
        System.out.println("Retornando ao menu principal...");
        return false;
    }
}
