package ExibirNotas;

import Objects.Database;
import Objects.InfosNota;

import java.util.Collections;
import java.util.Comparator;

public class ExibirTodasNotas extends Database {
    public static void execute(Enum materia){
        Collections.sort(notasList);
        for (InfosNota infos: notasList) {
            if (infos.getMateria().equals(materia)){
                System.out.println("Nome do aluno: " + infos.getAluno().getNomeAluno());
                System.out.println("Semestre: " + infos.getSemestre());
                System.out.println("Nota: " + infos.getNota());
                System.out.println("----------------------------------");
            }
        }

    }

}
