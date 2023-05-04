package Lista5;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int n,fatorial=1;
        System.out.println("escolha um número: ");
        n=bot.nextInt();
        if(n>0){

            for(int i=n;i>=1;i--){
                fatorial*=i;
            }        
            System.out.println(n +"!" + "=" + fatorial);
        }else{
            System.out.println("número invalido!");
        }
    bot.close();
    }
}
