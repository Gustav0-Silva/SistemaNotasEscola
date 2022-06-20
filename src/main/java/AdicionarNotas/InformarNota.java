package AdicionarNotas;

import java.util.Scanner;

public class InformarNota {
    public static int execute(Scanner sc){
        boolean ciclo;
        int nota;
        do {
            System.out.println("Por favor, digite a nota do aluno de 0 a 100");
            nota = sc.nextInt();
            ciclo = isValid(nota);
        }while (!ciclo);
        return nota;
    }

    private static boolean isValid(int nota){
        if (nota>0 && nota <= 100){
            return true;
        }else {
            System.out.println("Nota informada não é válida, tente novamente");
            System.out.println();
            return false;
        }
    }
}
