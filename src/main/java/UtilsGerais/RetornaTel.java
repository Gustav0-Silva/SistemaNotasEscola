package UtilsGerais;

import Objects.Aluno;
import Objects.Database;

public class RetornaTel extends Database {
    public static String execute(String nome){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                return aluno.getTelefoneResponsavel();
            }
        }
        return null;
    }
}
