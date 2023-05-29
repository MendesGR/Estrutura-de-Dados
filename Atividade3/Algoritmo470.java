import java.util.Scanner;

public class Algoritmo470 {

    static int primo(int n){
        int c = 0, p = 2;
        while(c == 0 && p <= n / 2){
            if(n % p == 0){
                c = 1;
            }
            p++;
        }
        return (c);
    }
    public static void main(String[] args) {
        int num, pri;
        System.out.println("digite um numero >0: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        pri = primo(num);
        if(pri == 0){
            System.out.println("e primo " + num);
        }else{
            System.out.println("nao e primo " + num);
        }    
        System.out.println();
        scan.close();
    }
}