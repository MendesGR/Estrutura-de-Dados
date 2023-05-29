import java.util.Scanner;

public class Algoritmo480 {

    static int reverso(int num){
        int soma, r;
        soma = 0;
        while(num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
    public static void main(String[] args) {
        int n, x;
        System.out.println("digite numero: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = reverso(n);
        System.out.println(n + " - " + x);
        if(x == n){
            System.out.println("E um numero capicua");
        } else{ 
            System.out.println("Nao e um numero capicua");
        }
        System.out.println();
        scan.close();
    }
}