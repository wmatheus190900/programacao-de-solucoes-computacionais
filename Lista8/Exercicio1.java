package Lista8;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int num1,num2,divisao;
        System.out.println("digite 2 números: ");
        num1=bot.nextInt();
        num2=bot.nextInt();
        try{
            divisao=num1/num2;
            System.out.println(num1 + "/" + num2+ " = "+ divisao);
        }catch(ArithmeticException e){
            System.out.println("Não há divisão por 0");
        }finally{
            bot.close();
        }
        
    }
    
}
