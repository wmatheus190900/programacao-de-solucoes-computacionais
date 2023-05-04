package Lista5;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner bot= new Scanner(System.in);
        int num,numMaior=0,numMenor=1000;
        for(int i=0;i<10;i++){
            System.out.println("Digite um número(de 1 a 1000)");
            num=bot.nextInt();
            if(num>numMaior){
                numMaior=num;
            }else if(num<numMenor){
                numMenor=num;
        }

        }
        System.out.println("Maior número: " + numMaior + "\nMenor número:" + numMenor);
        bot.close();
    }    
}
