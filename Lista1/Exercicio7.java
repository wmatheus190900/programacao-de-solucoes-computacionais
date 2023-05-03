package Lista1;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
		double salmin,salf,quantsal;
		Scanner bot= new Scanner(System.in);
		System.out.print("valor do salário mínimo:");
		salmin=bot.nextDouble();
		System.out.print("quanto vc ganha?");
		salf=bot.nextDouble();
		quantsal=salf/salmin;
		System.out.print("vc recebe "+quantsal+" minimos");
		bot.close();
	}
    
}
