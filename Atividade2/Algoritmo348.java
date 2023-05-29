import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];
        try (Scanner scan = new Scanner(System.in)) {
            for(L = 0; L <= 4; L++){
                System.out.println("digite " + (L+1) + " nome: " );
                nomes[L] = scan.nextLine();
                System.out.println();
            }
            for(L = 0; L < 4; L++){ 
                System.out.println("digite 1° nota: ");
                pr1[L] = scan.nextDouble();
                System.out.println("digite 2° nota: ");
                pr2[L] = scan.nextDouble();
                media[L] = (pr1[L] + pr2[L])/2;
                }
        }
        System.out.println("   RELACAO FINAL   ");
        for(L = 0; L <= 4; L++){
            System.out.println( (L+1) + "- " + nomes[L]);
            System.out.println(pr1[L] + "     " + pr2[L] + "     "+ media[L]);
            System.out.println();
        }
        System.out.println();
    }
}