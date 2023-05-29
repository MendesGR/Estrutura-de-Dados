import java.util.Scanner;

public class Algoritmo481 {

    static int converte(int nnum, int nbase){
        int nb = 0, b = 0, r;
        while(nnum >= nbase){
            r = nnum % nbase;
            nb = nb + 10 ^b * r;
            nnum = nnum / nbase;
            b++;
        }
        nb = nb + 10 ^b * nnum;
        return nb;
    }
    public static void main(String[] args) {
        int num, base, c;
        System.out.println("digite um numero maior ou igual a 0: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        while(num < 0){
            System.out.println("Numero negativo.Digite numero maior ou igual a 0: ");
            num = scan.nextInt();
        }
        System.out.println("digite a base em que deseja representa-lo(2-10): ");
        base = scan.nextInt();
        while(base < 2 || base > 10){
            System.out.println("Nao sei converter.Digite a base em que deseja representa-lo(2-10): ");
            base = scan.nextInt();
        }
        c = converte(num, base);
        System.out.println("numero em decimal: " + num);
        System.out.println("numero na base " + base + " : " + c);
        System.out.println();
        scan.close();
    }
}