package UtilsGerais;

import Objects.Aluno;
import Objects.Database;

public class RetornaEmail extends Database {
    public static String execute(String nome){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                return aluno.getEmailResponsavel();
            }
        }
        return null;
    }
}
