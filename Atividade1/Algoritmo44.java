import java.util.Scanner;

public class Algoritmo44 {
    public static void main(String[] args) {
        double num, base, logaritmo;
        System.out.println("entre com o logaritmando: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        System.out.println("entre com a base:");
        base = scan.nextDouble();
        logaritmo = Math.log(num) / Math.log(base);
        System.out.println("o logaritmo de " + num + " na base " + base + " e: " + logaritmo);
        scan.close();
    }
}