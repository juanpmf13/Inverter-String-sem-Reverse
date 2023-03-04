import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra = leitor.next();
       char[]  palavraSeparada = palavra.toCharArray();
        String reves = "";
        for (int i = palavra.length()-1 ; i>=0; i--){
            System.out.println("dentro do for");
            reves= reves + palavra.charAt(i);

        }
        System.out.println(reves);
    }
}
