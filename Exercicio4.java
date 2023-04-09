import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		double salario,novos;
		Scanner bot=new Scanner(System.in);
		System.out.print("Digite seu salário: ");
		salario=bot.nextDouble();
		novos = (0.25*salario) + salario;
		System.out.print("seu novo salario " + novos + " reais.");
		bot.close();
	}

}
