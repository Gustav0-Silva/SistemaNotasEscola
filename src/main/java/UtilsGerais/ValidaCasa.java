package UtilsGerais;

public class ValidaCasa {
    public static boolean execute (String casa){
        if (casa.equals("1")  || casa.equals("2")  ||casa.equals("3")  || casa.equals("4") ){
            return true;
        }else {
            System.out.println("Número de casa inválido, informe novamente");
            System.out.println();
            return false;
        }
    }

}
