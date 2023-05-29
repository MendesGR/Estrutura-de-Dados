import java.util.Scanner;

public class Algoritmo43 {
    public static void main(String[] args) {
        double num, logaritmo;
        System.out.println();
        System.out.println("entre com o logaritmando: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        logaritmo = Math.log(num) / Math.log(10);
        System.out.println("logaritmo: " + logaritmo);
        scan.close();
    }
}