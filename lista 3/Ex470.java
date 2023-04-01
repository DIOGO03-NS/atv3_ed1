import java.util.Scanner;

public class Ex470 {
    static int Primo(int n){
        int i = 0;
        int p = 2;
        while(i == 0 && p <= n/2){
            if(n%p == 0){
                p++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        int resultado = Primo(numero);

        if(resultado == 0){
            System.out.println("É PRIMO");
        }else{
            System.out.println("NÃO É PRIMO");
        }
    }
}
