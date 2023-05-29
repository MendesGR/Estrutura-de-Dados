import java.util.Scanner;

public class Algoritmo26 {
    public static void main(String[] args) {
        int data, dia, mes, ano, ndata;
        System.out.println("Digite data no formato DDMMAA: ");
        Scanner scan = new Scanner(System.in);
        data = scan.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes * 10000 + dia*100+ano;
        System.out.println();
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);
        System.out.println();
        System.out.println("DATA NO FORMATO MMDDAA: " + ndata);
        System.out.println();
        scan.close();
    }
}