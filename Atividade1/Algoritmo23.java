import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args) {
        int a, d;
        System.out.println("Digite numero de tres casas: " );  
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        d = a % 100 / 10;
        System.out.println();
        System.out.println("algarismo da casa das dezenas: " + d);
        scan.close();
    }
    
}