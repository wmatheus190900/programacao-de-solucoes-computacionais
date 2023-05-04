package Lista6;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int i,somaPares=0;
        try{
        int[] inteiros = new int[10];
        for(i=0;i<inteiros.length;i++){
            System.out.print("Digite um número inteiro:");
            inteiros[i]=bot.nextInt();
            if(inteiros[i]%2==0){
                somaPares+=inteiros[i];
            }
        }
        System.out.println("Vetor informado:");
        for (i = 0; i <inteiros.length; i++)
        System.out.printf("v[%d] = %2d\n", i, inteiros[i]);
        System.out.println("soma dos numeros pares: " + somaPares);
        }finally{
        bot.close();
        }
    }
}

