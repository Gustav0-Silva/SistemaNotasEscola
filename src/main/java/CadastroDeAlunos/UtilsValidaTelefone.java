package CadastroDeAlunos;

public class UtilsValidaTelefone {

    public static boolean execute(String telefone){
        if (telefone.matches(("[0-9]+")) && telefone.length() == 9){
            return true;
        } else {
            System.out.println("Número inválido, por favor, digite os 9 números sem o código de área");
            System.out.println();
            return false;
        }
    }

}

