import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args) {
        double sm, qtdade, preco, vp, vd;
        System.out.println("entre com o salário mínimo: ");
        Scanner scan = new Scanner(System.in);
        sm = scan.nextDouble();
        System.out.println("entre com a quantidade em quilowatt: ");
        qtdade = scan.nextDouble();
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.println("preço do quilowatt: " + preco);
        System.out.println(" valor a ser pago: " + vp);
        System.out.println(" valor com desconto: " + vd);
        scan.close();
    }
}