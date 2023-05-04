package Lista6;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        double[] reais=new double[10]; 
        int i;
        try{
        for(i=0;i<reais.length;i++){
            System.out.print("Informe números reais:");
            reais[i]=bot.nextDouble();
        }
        System.out.println("Vetor informado:");
        for (i = 0; i < reais.length; i++)
        if(reais[i]<0){
            System.out.printf("v[%d]",i);
            System.out.println("\n..................................");
        }else{
        System.out.printf("v[%d] = %.2f\n", i, reais[i]);
        }
        }finally{
        bot.close();
        }
    }
}
