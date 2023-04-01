import java.util.Scanner;

public class Ex481 {
    static int Conversao(int num, int base){
        int r;
        int nb = 0;
        int b = 0;

        while(num >= base){
            r = num % base;
            nb = nb + 10 * b * b * r;
            num = num / base;
            b++;
        }
        nb = nb + 10 *b*b * num;
        return nb;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO MAIOR OU IGUAL A ZERO: ");
        int num = input.nextInt();

        System.out.println("DIGITE A BASE(entre 2 e 10): ");
        int base = input.nextInt();

        int resultado = Conversao(num, base);
        System.out.println("O RESULTADO É: "+ resultado); 
    }
}
