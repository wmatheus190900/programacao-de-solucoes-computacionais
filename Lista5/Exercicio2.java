package Lista5;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner bot= new Scanner(System.in);
        int primeiro,limite;
        System.out.println("escolha 2 numeros");
        primeiro=bot.nextInt();
        limite=bot.nextInt();

        for(int i=primeiro;i<limite;i++){
            System.out.println(i);
        }
    bot.close();    
    }
    
}
