import java.util.Scanner;

public class Ex473 {
    public static int TesteLetra(String letra){
        letra = letra.toUpperCase();
        if(letra != "A" && letra != "E" && letra != "I" && letra != "O" && letra != "U"){
            return 1;
        }else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE A LETRA: ");
        String letra = input.nextLine();
        
        if(letra.length() > 1){
            System.out.println("MENSAGEM INCORRETA, DEVE SER INSERIDO APENAS UMA LETRA");
        }else{
            int resultado = TesteLetra(letra);
            if(resultado == 0){
                System.out.println("A LETRA É VOGAL");
            }
            if(resultado == 1){
                System.out.println("A LETRA É CONSOANTE");
            }
        }
    }
}
