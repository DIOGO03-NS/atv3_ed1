import java.util.Scanner;

public class Ex463 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("DIGITE O VALOR EM GRAUS: ");
        double angulo = input.nextDouble();

        double resultado = (angulo * Math.PI)/180;
        System.out.println("O RESULTADO EM GRAUS É: " + resultado);
    }
}
