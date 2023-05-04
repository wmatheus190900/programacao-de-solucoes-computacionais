package Lista5;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int base,expoente,potencia=1;
        System.out.println("Digite dois numeros:");
        base=bot.nextInt();
        expoente=bot.nextInt();
        for(int i=1;i<=expoente;i++){
            potencia*=base;
        }
        System.out.println(base + " ^ " + expoente + " = " + potencia);
    }
    
}
