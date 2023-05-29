import java.util.Scanner;

public class Algoritmo40 {
    public static void main(String[] args) {
        int quoc, rest, val1, val2;
        System.out.println("entre com o dividendo: ");
        Scanner scan = new Scanner(System.in);
        val1 = scan.nextInt();
        System.out.println("entre com divisor: ");
        val2 = scan.nextInt();
        quoc = val1 / val2;
        rest = val1 % val2;
        System.out.println();
        System.out.println("dividendo: " + val1);
        System.out.println("divisor: " + val2);
        System.out.println("quociente: " + quoc);
        System.out.println("reto: " + rest);
        System.out.println();
        scan.close();
    }
}
