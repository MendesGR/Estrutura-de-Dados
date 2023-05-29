import java.util.Scanner;

public class Algoritmo358 {
    public static void main(String[] args) {
        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        int totlucromenor10, totlucromenor20 , totlucromaior20, A;
        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;
        try (Scanner scan = new Scanner(System.in)) {
            for(A = 0; A < 100; A++){
                System.out.println("Preco de compra: ");
                precocompra[A] = scan.nextDouble();
                System.out.println();
                System.out.println("Preco de venda: ");
                precovenda[A] = scan.nextDouble();
                System.out.println();
            }
            for(A = 0; A < 100; A++){
                lucro = precovenda[A] - precocompra[A];
                if(lucro < 10.0){
                totlucromenor10++;
                }else{
                    if(lucro <= 20.0){
                       totlucromenor20++;
                    }else{
                    totlucromaior20++;
                    }
                }
            }
        }
        System.out.println("Total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);
        System.out.println();
    }
}