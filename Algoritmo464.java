import java.util.Scanner;

public class Algoritmo464 {

    static double graus(double gang){
        gang = gang * 180 / Math.PI;
        return (gang);
    }
    public static void main(String[] args) {
        double ang, g;
        System.out.println("digite angulo em radianos: ");
        Scanner scan = new Scanner(System.in);
        ang = scan.nextDouble();
        g = graus(ang);
        System.out.println("radianos: " + ang + "   graus: " + g);
        System.out.println();
        scan.close();
    }
}