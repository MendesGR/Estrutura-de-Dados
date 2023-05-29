import java.util.Scanner;

public class Algoritmo462 {

    static double media(double x, double y, double z) {
        double ma;
        ma = (x + y + z) / 3;
        return ma;    
    } 
    public static void main(String[] args) {
        double n1, n2, n3, m;
        System.out.println("digite nota 1: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextDouble();
        System.out.println("digite nota 2: ");
        n2 = scan.nextDouble();
        System.out.println("digite nota 3: ");    
        n3 = scan.nextDouble();
        System.out.println("media aritmetica e " + media(n1,n2,n3)); 
        m = media(n1,n2,n3);
        System.out.println("media armazenada em variavel = " + m);
        System.out.println();
        scan.close();
    }
}