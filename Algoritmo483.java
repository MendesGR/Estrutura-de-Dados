import java.util.Scanner;

public class Algoritmo483 {

    static int produtointerno(int vet1[], int vet2[], int quant){
        int prod = 0, i;
        for(i = 0; i < quant; i++){
            prod = prod + (vet1[i] * vet2[i]); 
        }
        return prod;
    }
    public static void main(String[] args) {
        int L, c;
        int[] num = new int[4];
        int[] num1 = new int[4];
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L < 4; L++){
                System.out.println("Digite 1 numero " + (L+1) + " : ");
                num[L] = scan.nextInt();
                System.out.println();
            }
            for(L = 0; L < 4; L++){
                System.out.println("Digite 2 numero " + (L+1) + " : ");
                num1[L] = scan.nextInt();
                System.out.println();
            }
            c = produtointerno(num, num1, 4);
            System.out.println("VETOR A       VETOR B");
            for(L = 0; L < 4; L++){
                System.out.println(num[L] + "             " + num1[L]);
                }
        }
        System.out.println();
        System.out.println("produto interno: " + c);  
    }
}