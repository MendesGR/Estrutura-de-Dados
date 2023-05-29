import java.util.Scanner;

public class Algoritmo499 {
    public static void main(String[] args) {
        int L, flag = 0, op;
        int[] num = new int[5];
        for(L = 0; L < 5; L++){
            num[L] = 0;
        }
        try (Scanner scan = new Scanner(System.in)) {
            do{
                System.out.println();
                System.out.println("MENU VETOR - FUNCAO");
                System.out.println("1 Dados do VETOR");
                System.out.println("2 Ordena VETOR");
                System.out.println("3 Imprime VETOR");
                System.out.println("4 Sai do programa");
                System.out.println();
                System.out.println("OPCAO: ");
                op = scan.nextInt();
                switch(op){
                    case 1:
                        entrada(num, 5);
                        flag = 1;
                        break;

                    case 2:
                        if(flag == 1){
                            ordena(num, 5);
                        }else{
                            System.out.println("Escolha primeiro opcao 1");
                        }
                        break;
                    case 3:  
                        if(flag == 1){
                            imprime(num, 5);
                        }else{
                            System.out.println("Escolha primeiro opcao 1");
                        }
                        break;
                    case 4:
                        System.out.println("Saindo do programa");
                        break;
                    default: System.out.println("Opcao invalida");           
                }

            }
            while(op != 4);
        }
        System.out.println();
    }

    public static int entrada(int[] vet1, int t) {
        int[] vet = new int[t];
        int L;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Entrada do VETOR");
            for(L = 0; L < t; L++){
                System.out.println("Digite numero " + (L+1) + ": ");
                vet[L] = scan.nextInt();
            }
        }
        return vet[t];
    }

    public static int imprime(int[] vet1, int t) {
        int[] vet = new int[t];
        int L;
        System.out.println("VETOR");
        for(L = 0; L < t; L++){
            System.out.println((L+1) + " - " + vet[L]);
        }
        return vet[t];
    }

    public static int ordena(int[] vet1, int tam) {
        int[] vet = new int[tam];
        int L1, c1, aux;
        for(L1 = 0; L1 < tam - 1; L1++){
            for(c1 = L1 + 1; c1 < tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return vet[tam];
    }
}