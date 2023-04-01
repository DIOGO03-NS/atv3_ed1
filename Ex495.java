public class Ex495 {
    static String Ordena(String vet[], int tam){
        int l1;
        int c1;
        String aux;
        for(l1 = 0; l1 < tam - 1; l1 ++){
            for(c1 = l1 + 1; c1 < tam; c1++){
                if(vet[l1] > vet[c1]){
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1]= aux; 
                }
            }
        }
    }
}
