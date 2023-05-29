import java.util.Scanner;

public class Algoritmo485 {

    public static void multivetor(int vet1[], String vet2[], int tam) {
        int i, w;
        for(i = 0; i < tam; i++){
            System.out.println();
            for(w = 0; w < vet1[i]; w++){
                System.out.println(vet2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int L;
        int num[] = new int[6];
        String num1[] = new String[6];
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L < 6; L++){
                System.out.println("Digite numero " + (L+1) + " : ");
                num[L] = scan.nextInt();
                System.out.println();
            }
            for(L = 0; L < 6; L++){
                System.out.println("Digite caractere " + (L+1) + " : ");
                num1[L] = scan.nextLine();
                System.out.println();
            }
            System.out.println();
            multivetor(num, num1, 6);
            System.out.println();
        }
    }
}