import java.util.Scanner;

public class Algoritmo497 {

    public static void ordena(int[] vet1, int tam){
        int[] vet = new int[tam];
        int L1, c1, aux;
        for(L1 = 0; L1 < tam - 1;L1++){
            for(c1 = L1 + 1; c1 < tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        int L, c, n;
        int[] num = new int[10];
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L < 10; L++){
                System.out.println("Digite numero " + (L+1) + ": ");
                num[L] = scan.nextInt();
            }
            System.out.println("Digite numero de busca: ");
            n = scan.nextInt();
        }
            ordena(num, 10);
            c = busca(num, 10, n);
            System.out.println("VETOR");
            for(L = 0; L < 10; L++){
            System.out.println((L+1) + " -- " + num[L]);
            }
            c++;
            if(c != 0){
                System.out.println("posicao no vetor: " + c);
            }else{
                System.out.println(" NAO ENCONTRAO");
            }
            System.out.println();
    }

    public static int busca(int[] vet1, int tam, int chave) {
        int[] vet = new int[tam];
        int ini, meio, fim;
        ini = 0;
        fim = tam - 1;
        while(ini <= fim){
            meio = (ini + fim) / 2;
            if(chave == vet[meio]){
                return meio;
            }else{
                if(chave < vet[meio]){
                    fim = meio - 1;
                }else{
                    ini = meio + 1;
                }
            }
        }
        meio = (-1);
        return meio;
    }

}