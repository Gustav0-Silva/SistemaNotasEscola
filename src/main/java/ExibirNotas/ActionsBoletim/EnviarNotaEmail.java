package ExibirNotas.ActionsBoletim;

import UtilsGerais.RetornaEmail;

public class EnviarNotaEmail {
    public static void execute(String nome){
        String email = RetornaEmail.execute(nome);
        System.out.println("Um e-mail com as notas do aluno " + nome + " foi enviado pro email " + email);
        System.out.println();
    }

}
