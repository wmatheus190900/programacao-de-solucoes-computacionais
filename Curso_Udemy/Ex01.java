package Curso_Udemy;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
		Scanner bot=new Scanner(System.in);
        System.out.println("quantos numeros:");
        int n=bot.nextInt();
        int numeros[]= new int[n];
        int maior=numeros[n];
        for(int i = 0; i< numeros.length;i++){
            numeros[i]=bot.nextInt();
        }
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>maior){
                maior=numeros[i];
            }
        }
        System.out.println(maior);
    }
}    


