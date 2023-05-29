import java.util.Scanner;

public class Algoritmo490 {

    public static int restantes(String vet, int tam, String x){
        String[] vet1 = new String[tam]; 
        int i, cont = 0;
        for(i = 0; i < tam; i++){
            if(vet1[i] == x){
                vet1[i].replace('c', '*');
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        String[] nome = new String[10];
        int L;
        try (Scanner scan = new Scanner(System.in)){
            for(L = 0; L < 10; L++){
                System.out.println("digite palavra em letras minusculas " + (L+1) + " : ");
                nome[L] = scan.nextLine();
                restantes(nome[L], nome[L].length(), "c");
                System.out.println();
            }
            for(L = 0; L < 10; L++){
                System.out.println( (L+1) + " - " + nome[L]);
            }
        }
    }
}