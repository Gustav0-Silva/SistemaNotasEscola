package AdicionarNotas;

import Factory.NotaFactory;

import java.util.Scanner;

public class AdicionarNotaPrincipal {
    public void execute (Scanner sc){
        System.out.println("Bem vindo ao método de adicionar notas");

        String aluno = SelecionarAluno.execute(sc);
        if (aluno.equals("0")){
            return;
        }

        int materia = SelecionarMateria.execute(sc);
        if (materia == 0){
            return;
        }

        int semestre = SelecionarSemestre.execute(sc);
        if (semestre == 0){
            return;
        }

        int nota = InformarNota.execute(sc);

        NotaFactory.execute(aluno,materia,nota,semestre);
    }
}
