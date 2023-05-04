package Lista5;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int num;
        System.out.println("Informe um número: ");
        num=bot.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(num + " x " + i + "= " + num*i);
        }
        bot.close();
    }    
}
