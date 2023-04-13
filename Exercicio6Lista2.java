import java.util.Scanner;
public class Exercicio6Lista2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner bot=new Scanner(System.in);
        System.out.println("valor dos lados: a,b e c,respectivamente.");
        a=bot.nextDouble();
        b=bot.nextDouble();
        c=bot.nextDouble();
        if ( Math.abs(b-c)< a && a < b + a && Math.abs(a-c)< b && b < a + c && Math.abs(a-b)< c && c < a + b){
            System.out.println("tres lados válidos para formação de um triângulo");;
        }else{
            System.out.println("não forma um triângulo");;
        }
        bot.close();
    }
}
