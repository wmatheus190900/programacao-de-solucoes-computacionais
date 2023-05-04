package Lista5;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        int maiorNum = 0;
		int menorNum = 1000000;
        Scanner bot= new Scanner(System.in);
		for (;;) {
			
			System.out.println("Informe um numero: ");
			int num = bot.nextInt();

			if (num > 0) {
				
			} else {
				break;
			}
			if (num > maiorNum) {
				maiorNum = num;
			}
			if (num < menorNum) {
				menorNum = num;
			}
		}
		System.out.println("Maior Numero informado: " + maiorNum);
		System.out.println("Menor Numero informado: " + menorNum);
        bot.close();
    }
}
