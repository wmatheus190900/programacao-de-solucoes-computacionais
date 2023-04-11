import java.util.Scanner;
public class Media {
    public static void main(String[]args){
        double nota1,nota2,media;
        Scanner bot=new Scanner(System.in);
        System.out.println("nota 1: ");
        nota1=bot.nextDouble();
        System.out.println("nota 2: ");
        nota2=bot.nextDouble();
        
        media= (nota1+nota2)/2;
        if(media>=7){
            System.out.println("Aprovado");
        }
        else if(media<7){
            System.out.println("reprovado");
        }
        bot.close();
    }
    
}
