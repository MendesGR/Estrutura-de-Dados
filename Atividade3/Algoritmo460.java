import java.util.Scanner;

public class Algoritmo460{

    static int dob(int x) {
        return(x * 2);
    }
    public static void main(String[] args) {
        int a,c; 
        for(c = 1; c <= 3; c++){
            System.out.println("digite um numero: ");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            System.out.println("dobro: " + dob(a));
            System.out.println();
            if(c == 3)
                scan.close();         
        }     
    }
}