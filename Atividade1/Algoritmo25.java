import java.util.Scanner;

public class Algoritmo25 {
    public static void main(String[] args) {
        int data, dia, mes, ano;
        System.out.println("Digite data no formato ddmmaa: ");
        Scanner scan = new Scanner(System.in);
        data = scan.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println();
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        System.out.println();
        scan.close();
    }
}