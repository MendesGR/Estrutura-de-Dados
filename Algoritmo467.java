import java.util.Scanner;

public class Algoritmo467 {

    static double loga(double base, double expo){
        double i;
        i = Math.log(base) / Math.log(expo);
        return (i);
    }
    public static void main(String[] args) {
        double z, L, b; int c;
        for(c = 1; c <= 3; c++){
            System.out.println("digite logaritmando maior que 0: ");
            Scanner scan = new Scanner(System.in);
            L = scan.nextDouble();
            while(L == 0){
                System.out.println("Invalido.Digite logaritmando maior que 0: ");
                L = scan.nextDouble();
            }
            System.out.println("Digite base maior que 0 e diferente de 1: ");
            b = scan.nextDouble();
            while(b < 0 || b == 1){
                System.out.println("Invalido.Digite base maior que 0 e diferente de 1: ");
                b = scan.nextDouble();
            }
            System.out.println("logaritmo e " + loga(L, b));
            z = loga(L, b);
            System.out.println("z = " + z);
            scan.close();
        } 
        System.out.println();
    }
}