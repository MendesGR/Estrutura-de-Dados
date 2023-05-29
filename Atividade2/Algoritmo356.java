import java.util.Scanner;

public class Algoritmo356 {
    public static void main(String[] args) {
        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        Scanner scan = new Scanner(System.in);
        for(L=0; L<=14; L++){
            System.out.println("Digite " + (L+1) + " nome: ");
            nomes[L] = scan.nextLine();
            System.out.println();
            while(nomes[L].length() > 30){
                System.out.println("Nomes com ate 30 caracteres");
                System.out.println("Digite " + (L+1) + " nome: ");
                nomes[L] = scan.nextLine();
                System.out.println();
            }
            t = 30 - nomes[L].length();
            for(c = 1; c <= t; c++){
                nomes[L] = nomes[L].concat(" ");
            }
            System.out.println("digite 1 nota: ");
            pr1[L] = scan.nextDouble();
            System.out.println("digite 2 nota: ");
            pr2[L] = scan.nextDouble();
            media[L] = (int) ((pr1[L]+ pr2[L]) / 2 + 0.0001);
            if(media[L] >= 6){
                sit[L] = "AP";
            }else{
                sit[L] = "RP";
            }
        }
        System.out.println();
        System.out.println("     RELACAO FINAL     ");
        for(L = 0; L <= 14; L++){
            System.out.println((L+1) + "- " + nomes[L] + "   " + pr1[L] + "   " + pr2[L] + "   " + media[L]
            + "   " + sit[L]);
        }
        System.out.println();
    }
}