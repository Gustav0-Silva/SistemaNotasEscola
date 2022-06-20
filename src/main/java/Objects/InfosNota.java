package Objects;

import java.util.Comparator;

public class InfosNota implements Comparable<InfosNota> {

    private Aluno aluno;
    private int nota;
    private Enum materia;
    private int semestre;

    public InfosNota(Aluno aluno, int nota, Enum materia, int semestre) {
        this.aluno = aluno;
        this.nota = nota;
        this.materia = materia;
        this.semestre = semestre;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public int getNota() {
        return nota;
    }

    public Enum getMateria() {
        return materia;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public int compareTo(InfosNota o) {
        if (this.semestre > o.semestre){
            return 1;
        } else if (this.semestre < o.semestre) {
            return -1;
        }else {
            return 0;
        }
    }
}
