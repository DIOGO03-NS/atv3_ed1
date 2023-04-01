import java.util.Scanner;

public class Ex462 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE A PRIMEIRA NOTA: ");
        int nota1 = input.nextInt();

        System.out.println("DIGITE A SEGUNDA NOTA: ");
        int nota2 = input.nextInt();

        System.out.println("DIGITE A TERCEIRA NOTA: ");
        int nota3 = input.nextInt();

        System.out.println("A MEDIA É: " + (nota1 + nota2 + nota3)/3);
    }
}
