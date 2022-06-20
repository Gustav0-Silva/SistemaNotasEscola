package ExibirNotas;

import Objects.*;

public class Exemplos extends Database {
    public static void CadastrarExemplos(){
        Aluno aluno1 = new Aluno("Gustavo","g.silva@gmail.com","985854747", House.RAVENCLAW);
        alunosList.add(aluno1);
        Aluno aluno = new Aluno("Gabriela","gabriela@gmail.com","966633214",House.HUFFLEPUFF);
        alunosList.add(aluno);

        InfosNota nota = new InfosNota(aluno,50, Materia.HERBOLOGY,2);
        notasList.add(nota);
        nota = new InfosNota(aluno,50, Materia.HERBOLOGY,3);
        notasList.add(nota);
        nota = new InfosNota(aluno,50, Materia.HERBOLOGY,4);
        notasList.add(nota);
        nota = new InfosNota(aluno,50, Materia.HERBOLOGY,1);
        notasList.add(nota);

        nota = new InfosNota(aluno1,40,Materia.POTIONS,1);
        notasList.add(nota);
        nota = new InfosNota(aluno1,40,Materia.POTIONS,4);
        notasList.add(nota);
        nota = new InfosNota(aluno1,40,Materia.POTIONS,2);
        notasList.add(nota);
        nota = new InfosNota(aluno1,40,Materia.POTIONS,3);
        notasList.add(nota);

    }
}
