package ExibirNotas.ActionsBoletim;

import UtilsGerais.RetornaEmail;

public class EnviarNotaMsg {
    public static void execute(String nome){
        String tel = RetornaEmail.execute(nome);
        System.out.println("Um e-mail com as notas do aluno " + nome + " foi enviado pro telefone " + tel);
        System.out.println();
    }
}
