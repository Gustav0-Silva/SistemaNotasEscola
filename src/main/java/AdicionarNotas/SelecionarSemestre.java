package AdicionarNotas;

import java.util.Scanner;

public class SelecionarSemestre {
    public static int execute(Scanner sc){
        System.out.println("Por favor, digite o semestre que deseja adicionar a nota");
        System.out.println("1 - Primeiro semestre");
        System.out.println("2 - Segundo semestre");
        System.out.println("3 - Terceiro semestre");
        System.out.println("4 - Quarto semestre");
        System.out.println("5 - Sair");
        String semestre = sc.nextLine();

        switch (semestre){
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                System.out.println("Saindo do modo de adicionar notas...");
                break;
            default:
                System.out.println("Número inválido, tente novamente por favor");
                execute(sc);
        }
        return 0;
    }
}
