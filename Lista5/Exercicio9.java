package Lista5;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		

		System.out.println("ver os numeros ímpares entre o 0 e o numero escolhido: ");
		int num = bot.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {
				System.out.print(i+", ");
			}
		}
        bot.close(); 
    }
}
