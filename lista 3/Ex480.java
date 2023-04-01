import java.util.Scanner;

public class Ex480 {
    public static String Capicua(String numero){
        String reverso = "";
        for(int i = numero.length(); i <= 0; i-- ){
            reverso += numero.charAt(i);
        }
        if(numero == reverso){
            return(numero + " - " + reverso + "\nÉ UM NUMERO CAPICUA");
        }else{
            return(numero + " - " + reverso + "\nNÃO É UM NUMERO CAPICUA");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO: ");
        String numero = input.nextLine();

        System.out.println(Capicua(numero));
    }
}
