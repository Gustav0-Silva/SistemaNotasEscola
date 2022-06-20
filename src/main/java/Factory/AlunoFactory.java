package Factory;

import Objects.Aluno;
import Objects.Database;
import Objects.House;

public class AlunoFactory extends Database {
    public static void execute(String nome, String telefone, String email, String casa){
        Enum house = witchHouse(casa);
        Aluno aluno = new Aluno(nome,email,telefone,house);
        alunosList.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println();
    }

    private static Enum witchHouse(String casa){
        switch (casa){
            case "1":
                return House.SLYTHERIN;
            case "2":
                return House.GRYFFINDOR;
            case "3":
                return House.HUFFLEPUFF;
            case "4":
                return House.RAVENCLAW;
        }
        return null;
    }
}
