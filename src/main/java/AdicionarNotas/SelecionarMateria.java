package AdicionarNotas;

import Objects.Aluno;

import java.util.Scanner;

public class SelecionarMateria {
    public static int execute(Scanner sc){
        System.out.println("Digite a matéria que deseja adicionar a nota: ");
        System.out.println("1 - Poções");
        System.out.println("2 - Defesa Contra Arte das Trevas");
        System.out.println("3 - Herbologia");
        System.out.println("4 - Sair");
        String action = sc.nextLine();

        switch (action){
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                System.out.println("Saindo do sistema...");
                return 0;
            default:
                System.out.println("Matéria inválida, tente novamente por favor");
                execute(sc);
                break;
        }
        return 0;
    }
}
