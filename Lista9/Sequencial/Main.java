package Lista9.Sequencial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		double reais[] = new double[11];
		String confirma;

		for (int i = 0; i < reais.length - 1; i++) {
			System.out.printf("Informe o valor do vetor[%d]: ", i);
			reais[i] = bot.nextDouble();

		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = bot.nextDouble();
			System.out.println("Selecione o tipo de busca \n(1)Sequencial (2)Sequencial com sentinela");
			int opção = bot.nextInt();

			switch (opção) {
			case 1:
				Busca.buscaSequencial(reais, v);
				break;

			case 2:
				Busca.buscaSequencialSentinela(reais, v);
				break;
			default:
				System.out.println("Opção invalida.");
			}
			System.out.println("Gostaria de continuar? (S)im (N)ão");
			confirma =bot.next();

		} while (confirma.equalsIgnoreCase("S") || confirma.equalsIgnoreCase("Sim"));
		bot.close();

		System.out.println("Fim do programa");
		System.exit(0);

	}
}
