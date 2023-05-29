import java.util.Stack;

public class Frase1Pilha{
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<Character>();
        Stack<Character> outrapilha = new Stack<Character>();

        String frase = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) != ' '){
                pilha.push(frase.charAt(i));
            }else{
                while(!pilha.empty()){
                    outrapilha.push(pilha.pop());
                }
                outrapilha.push(' ');
            }
        }

        while(!outrapilha.empty()){
            pilha.push(outrapilha.pop());
        }

        while(!pilha.empty()){
            System.out.println(pilha.pop());
        }
    }
}