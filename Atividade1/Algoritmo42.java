import java.util.Scanner;

public class Algoritmo42 {
    public static void main(String[] args) {
        double angulo, rang;
        System.out.println("digite um angulo em graus: ");
        Scanner scan = new Scanner(System.in);
        angulo = scan.nextDouble();
        rang = (angulo * Math.PI) / 180; 
        System.out.println("seno: "+ Math.sin(rang));
        System.out.println("co-seno: " + Math.cos(rang));
        System.out.println("tangente: " + Math.tan(rang));
        System.out.println("co-secante: " + 1/ Math.sin(rang));
        System.out.println("secante: " + 1/ Math.cos(rang));
        System.out.println("cotangente: " + 1/ Math.tan(rang));
        scan.close();
    }
}