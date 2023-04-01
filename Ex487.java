import java.util.Scanner;

public class Ex487 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE TAMANHO: ");
        int tamanho = input.nextInt();
        int vetorValores[] = new int[tamanho + 1];

         for(int i = tamanho; i > 0; i++){
            System.out.println("DIGITE UM NUMERO: ");
            vetorValores[i] = input.nextInt();
        }
        for(int i = 0; i < tamanho; i++){
            System.out.println((i + 1) + " - "  + vetorValores[i]);
        }
    }
}
