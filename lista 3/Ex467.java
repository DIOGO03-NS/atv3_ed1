import java.util.Scanner;

public class Ex467 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float z;
        float l;
        float b;
        int c;

        for(c = 1; c <= 3; c++){
        System.out.println("DIGITE O LOGARITMANDO MAIOR QUE 0: ");
        l = input.nextFloat();

        while(l <= 0){
            System.out.println("INVALIDO, DIGIT");
        }
    }
    
}
