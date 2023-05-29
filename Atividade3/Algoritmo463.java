import java.util.Scanner;

public class Algoritmo463 {

    static double radiano(double rang) {
        rang = Math.PI / 180;  
        return rang;     
    }
    public static void main(String[] args) {
        double ang, r;
        System.out.println("digite angulo em graus: ");
        Scanner scan = new Scanner(System.in);
        ang = scan.nextDouble();
        r = radiano(ang);
        System.out.println("graus: " + ang + "    radianos:  " + r);
        System.out.println();
        scan.close();
    }
}