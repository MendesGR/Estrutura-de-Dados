import java.util.Scanner;

public class Algoritmo473 {

    static int maiuscula(String letra){
        if(letra != "A" && letra != "a" && letra != "E" && letra !="e" && letra != "I" && letra != "i"
        && letra != "O" && letra != "o" && letra != "U" && letra != "u"){
            return (1);
        }else{
            return (0);
        }
    }
    public static void main(String[] args) {
        String c; int x;
        System.out.println("Digite letra: ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextLine();
        x = maiuscula(c);
        if(x == 1){
            System.out.println("e uma consoante ");
        }else{
            System.out.println("nao e uma consoante ");
        }
        System.out.println();
        scan.close();
    }
}