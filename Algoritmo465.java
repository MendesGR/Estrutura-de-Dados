import java.util.Scanner;

public class Algoritmo465 {

    static void verifica(int n1, int n2) {
        if(n1 < n2)
            System.out.println(n2);
        else
            System.out.println(n1);
    }
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Digite numero 1: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        System.out.println("Digite numero 2: ");
        num2 = scan.nextInt();
        System.out.println();
        verifica(num1, num2);
        System.out.println();
        scan.close();
    }
}