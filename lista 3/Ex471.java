import java.util.Scanner;

public class Ex471 {
    public static int Divisor(int x, int y){
        int n1 = 0;
        int r = x % y;

        while(r == 0){
            n1 ++;
            x = x / y;
            r = x % y;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O DIVIDENDO");
        int dividendo = input.nextInt();

        System.out.println("DIGITE DIVISOR");
        int divisor = input.nextInt();

        int resultado = Divisor(dividendo, divisor);

        if(resultado == 0){
            System.out.println("NENHUMA VEZ");
        }else{
            System.out.println(resultado + " VEZES");
        }
    }
}