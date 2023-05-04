package Lista2;
import java.util.Scanner;
public class Exercicio8Lista2 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        System.out.println("Escreva o código do produto: ");
        int código=bot.nextInt();
        switch(código){
            case 1:
            System.out.println("R$ 99,99");
            case 2:
            System.out.println("R$ 103,89");
            break;
            case 3:
            System.out.println("R$ 49,98");
            break;
            case 4:
            System.out.println("R$ 89,72");
            break;
            case 5:
            System.out.println("R$ 97,35");
            break;
            default:
            System.out.println("Código inválido");

        }
    bot.close();
    }
}   
