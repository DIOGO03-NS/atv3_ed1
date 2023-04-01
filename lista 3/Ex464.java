import java.util.Scanner;
public class Ex464 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("DIGITE O VALOR EM GRAUS: ");
        double angulo = input.nextDouble();

        double resultado = (angulo * 180)/Math.PI;
        System.out.println("O RESULTADO EM RADIANOS É: " + resultado);
    }
}
