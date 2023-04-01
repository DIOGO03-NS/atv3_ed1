import java.util.Scanner;

public class Ex494 {
    static String Troca(String n1, String n2){
        String aux;
        aux = n1;
        n1 = n2;
        n2 = aux;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l; 
        int c;
        int t; 
        int t1;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];

        for(l = 0; l < 3; l++){
            System.out.println("DIGITE O NOME: ");
            nome[l] = input.nextLine();

            System.out.println("DIGITE O ENDEREÇO: ");
            ender[l] = input.nextLine();

            System.out.println("DIGITE O PROFISSAO: ");
            profissao[l] = input.nextLine();

        }

        for(l = 0; l < 2; l++){
            for(c = l + 1; c < 3; c++){
                se(nome[l] > nome[c]){
                    Troca(nome[l], nome[c]);
                    Troca(ender[l], ender[c]);
                    Troca(prof[l], prof[c]);
                }
            }
        }
    }
}