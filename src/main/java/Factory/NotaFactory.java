package Factory;

import Objects.Aluno;
import Objects.Database;
import Objects.InfosNota;
import Objects.Materia;

public class NotaFactory extends Database {
    public static void execute(String nome, int materia, int nota, int semestre){
        switch (materia){
            case 1:
                addPotions(nome,nota,semestre);
                break;
            case 2:
                addDADefense(nome,nota,semestre);
                break;
            case 3:
                addHerbology(nome, nota, semestre);
                break;
        }
    }

    private static void addPotions(String nome, int nota, int semestre){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                InfosNota notaAdd = new InfosNota(aluno, nota, Materia.POTIONS,semestre);
                notasList.add(notaAdd);
                System.out.println("Nota de Poções do aluno " + aluno + " foi adicionada com sucesso");
                System.out.println();
            }
        }
    }

    private static void addDADefense(String nome, int nota, int semestre){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                InfosNota notaAdd = new InfosNota(aluno, nota, Materia.DEFENSE,semestre);
                notasList.add(notaAdd);
                System.out.println("Nota de Defesa Contra Arte das Trevas" +
                        " do aluno " + aluno + " foi adicionada com sucesso");
                System.out.println();
            }
        }
    }
    private static void addHerbology(String nome, int nota, int semestre){
        for (Aluno aluno: alunosList) {
            if (aluno.getNomeAluno().equals(nome)){
                InfosNota notaAdd = new InfosNota(aluno, nota, Materia.HERBOLOGY,semestre);
                notasList.add(notaAdd);
                System.out.println("Nota de Herbologia do aluno " + aluno + " foi adicionada com sucesso");
                System.out.println();
            }
        }
    }
}
