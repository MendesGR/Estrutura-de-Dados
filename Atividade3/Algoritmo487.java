import java.util.Scanner;

public class Algoritmo487 {

    public static void inverte(int vet[], int max){
        int k, i, aux;
        k = max;
        for(i = 0;i < max / 2; i++){
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    } 
    public static void main(String[] args) {
        int L;
        int[] num = new int[10];
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L < 10; L++){
                System.out.println("Digite numero " + (L+1) + " : ");
                num[L] = scan.nextInt();
            }
            inverte(num, 10);
            System.out.println(" VETOR ");
            System.out.println();
            for(L = 0; L < 10; L ++){
                System.out.println( (L+1) + " - " + num[L]);
            }
        }
    }
}