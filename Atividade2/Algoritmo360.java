import java.util.Scanner;

public class Algoritmo360 {
    public static void main(String[] args) {
        int[] ultdia = new int[12];
        String[] signo = new String[12];
        int data, i, dia, mes;
        try (Scanner scan = new Scanner(System.in)) {
            for(i = 0; i < 12; i++){
                System.out.println("digite signo: ");
                signo[i] = scan.nextLine();
                System.out.println("digite ultimo dia: ");
                ultdia[i] = scan.nextInt();
            }
            System.out.println("digite data no formato ddmm ou 9999 para terminar: ");
            data = scan.nextInt();
            while(data != 9999){
                dia = data / 100;
                mes = data % 100;
                mes--;
                if(dia > ultdia[mes]){
                    mes = (mes+1) % 12;
                }
                System.out.println("signo: " + signo[mes]);
                System.out.println("digite data no formato ddm ou 9999 para terminar: ");
                data = scan.nextInt();
            }
        }
        System.out.println();
    }
}