import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args) {
        double saldo, nsaldo;
        System.out.println("digite saldo: ");
        Scanner scan = new Scanner(System.in);
        saldo = scan.nextDouble();
        nsaldo = saldo * 1.01;
        System.out.println("novo saldo: " + nsaldo);
        scan.close();
    }
}