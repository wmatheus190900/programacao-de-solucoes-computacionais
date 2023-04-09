import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
		double peso,pesowith15,pesowith20;
		Scanner bot=new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		peso= bot.nextDouble();
		pesowith15=(0.15*peso)+ peso;
		System.out.println("peso com 15/100: "+ pesowith15);
		pesowith20=(0.20*peso)+peso;
		System.out.println("peso com 20/100: "+pesowith20);
		bot.close();
	}
}
