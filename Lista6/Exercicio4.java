package Lista6;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner bot= new Scanner(System.in);
        int i;
        double[] reais=new double[10];
        try{
        for(i=0;i<reais.length;i++){
            System.out.print("Digite um número real:");
            reais[i]=bot.nextDouble();
        }
        for(i=0;i<reais.length;i++)
        if(i%2==0){
            System.out.println(reais[i]);
        }
        }finally{
        bot.close();
        }
    }
}
