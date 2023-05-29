import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args) {
        double a, b, c, d, mp;
        System.out.println("entre com 1 numero: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        System.out.println("entre com 2 numero: ");
        b = scan.nextDouble();
        System.out.println("entre com 3 numero: ");
        c = scan.nextDouble();
        System.out.println("entre com 4 numero: ");
        d = scan.nextDouble();
        mp = (a*1 + b*2 + c*3 + d*4) /10;
        System.out.println("media ponderada: " + mp);
        System.out.println();
        scan.close();
    }
}