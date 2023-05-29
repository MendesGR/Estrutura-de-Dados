import java.util.Scanner;

public class Algoritmo471 {

    static int divisor(int x, int y){
        int r, n1 = 0;
        r = x % y;
        while(r == 0){
            n1++;
            x = x / y;
            r = x % y;
        }
        return n1;
    }
    public static void main(String[] args) {
        int num, num1, n;
        System.out.println("digite dividendo: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println("digite divisor: ");
        num1 = scan.nextInt();
        while(num1 > num){
            System.out.println("INVALIDO.digite numero menor do que o dividendo: ");
            num1 = scan.nextInt();
        }
        n = divisor(num, num1);
        if(n == 0){
            System.out.println("nenhuma vez");
        }else{
            System.out.println("Numero de vezes: " + n);
        }
        System.out.println();
        scan.close();
    }
}