import java.util.Scanner;

public class Ex465 {
    public static void maiorNum(int n1, int n2){
        if(n1 > n2) System.out.println(n1);
        if(n1 < n2) System.out.println(n2);
        if(n1 == n2) System.out.println("VALORES IGUAIS");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO VALOR: ");
        int valor1 = input.nextInt();
        System.out.println("DIGITE O SEGUNDO VALOR: ");
        int valor2 = input.nextInt();

        System.out.println("O MAIOR VALOR É: ");
        maiorNum(valor1, valor2);

    }
}
