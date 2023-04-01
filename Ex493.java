import java.util.Scanner;

public class Ex493 {
    static int busca(int vet[], int tamanho){
        int x, i, l;
        for(i = 0; i < tamanho - 1; i++){
            if(vet[i] < vet [i+1]){
                x = 0;
                return x; 
            }
        }
        x = 1;
        return x;
    }

    static int busca1(int vet[], int tamanho){                          
        int i, x, l;
        for(i = 0; i < tamanho -1 ; i++){
            if(vet[i] > vet[i+1]){
                 x = 0;
                 return x;
            }
        }
        x = 1;
        return x;
    }

    static int verificaordem(int vetor[], int t){
        int r;
        int res;
        int l;

        r = busca(vetor, t);
        if (r == 1){
            res = 2;
            return res;
        }else{
            r = busca1(vetor, t);
            if(r == 1){
                res = 1;
                return res; 
            }else{
                res = 0;
                return res;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l;
        int c;
        int aux;
        int[] num = new int[10];

        for(l = 0; l < 10; l++){
            System.out.println("DIGITE UM NUMERO PARA A POSICAO " +(l+1)+": ");
            num[l] = input.nextInt();
        }
        c = verificaordem(num, 10);

        if(c == 1){
            System.out.println("ORDENAÇÃO CRESCENTE");
        }else{
            if(c == 2){
                System.out.println("ORDENAÇÃO CRESCENTE");
            }else{
                System.out.println("NÃO ESTA EM ORDEM");
            }
        }
    }

}

