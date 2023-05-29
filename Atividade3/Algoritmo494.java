import java.util.Scanner;

public class Algoritmo494 {

    public static void troca(String n1, String n2){
        String aux;
        aux = n1;
        n1 = n2;
        n2 = aux;
    }
    public static void main(String[] args) {
        int L, c;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];
        try (Scanner scan = new Scanner(System.in)){ 
        for(L = 0; L < 3; L++){
            System.out.println("Digite nome: ");
            nome[L] = scan.nextLine();
            System.out.println("Digite endereco: ");
            ender[L] = scan.nextLine();
            System.out.println("Digite profissao: ");
            prof[L] = scan.nextLine();
        }
        for(L = 0; L < 2; L++){
            for(c = L+1; c < 3; c++){
                if(nome[L] > nome[c]){
                    troca(nome[L], nome[c]);
                    troca(ender[L], ender[c]);
                    troca(prof[L], prof[c]);
                }
            }
        }
        for(L = 0; L < 3; L++){
            System.out.println(nome[L] + "     " + ender[L] + "     " + prof[L]);
        }
        }
        System.out.println();
    }
}