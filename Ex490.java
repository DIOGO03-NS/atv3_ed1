import java.util.Scanner;

public class Ex490 {
    static int Restantes (String vet[], int tamanho, String X){
        int i;
        int cont = 0;

        for(i = 0; i < tamanho; i++){
            if(vet[i] == X){
                vet[i] = "*";
                cont++;
            }
        }
        return(cont);
    }
    public static void main(String[] args) {
        String[] nome = new String[10];
        int l;
        Scanner input = new Scanner(System.in);
        for(l = 0; l < 10; l++){
            System.out.println("DIGITE A PALAVRA " + l+1);
            nome[l] = input.nextLine();
            Restantes(nome[l], nome[1].length(), "d");
        }

        for(l = 0; l < 10; l++){
            System.out.println(l+1 +"- " + nome[l]);
        }
    }
}
