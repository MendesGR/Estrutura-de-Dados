import java.util.Scanner;

public class Algoritmo493 {

    public static int busca(int vet[], int tam){
        int i,x;
        for(i = 0; i < tam - 1; i++){
            if(vet[i] < vet[i+1]){
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }
    
    public static int busca1(int vet[], int tam){
        int i,x;
        for(i = 0; i < tam-1; i++){
            if(vet[i] > vet[i +1]){
                x = 0;
                return (x);
            }
        }
        x = 1;
        return (x);
    }

    public static int verificaOrdem(int vetor[], int t) {
        int r, res;
        r = busca(vetor, t);
        if(r == 1){
            res = 2;
            return (res);
        }else{
            r = busca1(vetor, t);
            if(r == 1){
                res = 1;
                return (res);
            }else{
                res = 0;
                return (res);
            }
        }
    }
    public static void main(String[] args) {
        int L, c;
        int[] num = new int[10]; 
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L < 10; L++){
                System.out.println("digite numero " + (L+1) + " : ");
                num[L] = scan.nextInt();
            }
        }
        c = verificaOrdem(num, 10);
        System.out.println();
        if(c == 1){
            System.out.println("ORDENACAO CRESCENTE");
        }else{
            if(c == 2){
                System.out.println("ORDENACAO DECRESCENTE");
            }else{
                System.out.println("NAO ESTA ORDENADO");
            }
        }
        System.out.println();
    }
}