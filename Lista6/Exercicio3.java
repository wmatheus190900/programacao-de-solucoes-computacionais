package Lista6;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner bot= new Scanner(System.in);
        int i;
        double maior=0,menor=1000;
        double[] reais=new double[10];
        try{
        for(i=0;i<reais.length;i++){
            reais[i]=bot.nextDouble();
            if(reais[i]>maior){
                maior=reais[i];
            }else if(reais[i]<menor){
                menor=reais[i];
            }
        }
        for(i=0;i<reais.length;i++)
        System.out.printf("v[%d] = %.2f\n",i,reais[i]);
        System.out.println("maior:" + maior + "\nmenor: " + menor);
        }finally{
        bot.close();
        }
    }
}
