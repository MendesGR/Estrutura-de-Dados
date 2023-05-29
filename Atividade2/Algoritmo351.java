import java.util.Scanner;

public class Algoritmo351 {
    public static void main(String[] args) {
        int L, num;
        String[] nomes = new String[5];
        try (Scanner scan = new Scanner(System.in)) {
            for(L=0;L<=4;L++){
                System.out.println("nome " + (L+1) + ": ");
                nomes[L] = scan.nextLine();
                System.out.println();
            }
            System.out.println("Digite o numero da pessoa: ");
            num = scan.nextInt();
            System.out.println();
            while(num < 1 || num > 5){
                System.out.println(" Numero fora do intevalo");
                System.out.println(" Digite o numero da pessoa: ");
                num = scan.nextInt();
            }
        }
        System.out.println(nomes[num - 1]);
        System.out.println();
    }
}