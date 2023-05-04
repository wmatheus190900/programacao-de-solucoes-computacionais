package Lista2;
import java.util.Scanner;
public class LadosTri {
    public static void main(String[]args){
        double ladoa,ladob,ladoc;
        Scanner bot=new Scanner(System.in);
        System.out.println("Quais são os tres lados?");
        ladoa=bot.nextDouble();
        ladob=bot.nextDouble();
        ladoc=bot.nextDouble();
        if(ladoa==ladob & ladob==ladoc){
            System.out.println("O triangulo é Equilátero");
        }
        else if(ladoa==ladob & ladob!=ladoc || ladob==ladoc & ladoc!=ladoa || ladoa==ladoc & ladoc!=ladob ){
            System.out.println("O triangulo é Isósceles");
        }
        else if(ladoa!=ladob & ladob!=ladoc){
            System.out.println("O triangulo é Escaleno");
        bot.close();
        }    
    }

}
