import java.util.Scanner;

public class Algoritmo346{
    public static void main(String[] args) {
        String frase;
        int op, x, tam;
        do{
            System.out.println("MENU");
            System.out.println("1-Imprime o comprimento da frase ");
            System.out.println("2-Imprime os dois primeiros e os dois ultmos caracteres da frase");
            System.out.println("3-Imprime a frase espelhada ");
            System.out.println("4-Termina o algoritmo ");
            System.out.println("OPCAO: ");
            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();
            scan.nextLine();
            switch(op){
                case 1:
                System.out.println("Digite uma frase: ");
                frase = scan.nextLine();
                tam = frase.length();
                System.out.println("numero de caracteres na frase: " + tam);
                break;
                case 2:
                    System.out.println("Digite uma frase: ");
                    frase = scan.nextLine();
                    tam = frase.length() - 2;
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    System.out.println("Os dois ultimos caracteres: " + frase.substring(tam));
                    break;
                    
                case 3:
                        System.out.println("Digite uma frase: ");
                        frase = scan.nextLine();
                        tam = frase.length();
                        for(x = tam -1; x >= 0; x--){
                            System.out.println(frase.substring(x));
                        }
                        break;
                case 4:
                    System.out.println("Fim do algoritmo");
                    break;
                default:
                System.out.println("opcao nao disponivel");    
                break;
            }
            System.out.println();
            scan.close();
        }
        while(op != 4);
        System.out.println();
    }
}