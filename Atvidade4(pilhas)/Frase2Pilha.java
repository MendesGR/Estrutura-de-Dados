import java.util.Stack;

public class Frase2Pilha {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<Character>();
        Stack<Character> pilhaAuxiliar = new Stack<Character>();

        String frase = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        for(int i= 0; i < frase.length(); i++){
            if(frase.charAt(i) != ' '){
                pilha.push(frase.charAt(i));
            }else{
                while(!pilha.empty()){
                    pilhaAuxiliar.push(pilha.pop());
                }
                pilhaAuxiliar.push(' ');
            }
        }

        while(!pilhaAuxiliar.empty()){
            pilha.push(pilhaAuxiliar.pop());
        }

        while(!pilha.empty()){
            System.out.println(pilha.pop());
        }
    }
}
