package Lista10;
import java.util.Scanner;
import java.util.Arrays;
public class Principal {
    public static void main(String[] args) {
        Scanner bot= new Scanner(System.in);
		Ordenacao metodos=new Ordenacao();
		int[] vetor=new int[10];
		int opcao;
		String continuacao;
		do {
			System.out.print("Informe 10 numeros:");
			for(int i=0;i<vetor.length;i++) {
				vetor[i]=bot.nextInt();
			}
			System.out.println("selecione um dos métodos de ordenação do vetor(1-bolha;2-seleção;3-inserção;)");
			opcao=bot.nextInt();
			switch(opcao) {
				case 1:
				metodos.bolha(vetor);
				System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
				break;
				case 2:
				metodos.selecao(vetor);
				System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
				break;
				case 3:
				metodos.insercao(vetor);
				System.out.println("Vetor ordenadot: " + Arrays.toString(vetor));
				break;
			}
			System.out.println("Deseja continuar");
			continuacao=bot.next();
		
		}while(continuacao.equalsIgnoreCase("sim")|| continuacao.equalsIgnoreCase("s") );
	System.out.print("Fim!Obrigado por participar!");
	bot.close();
    }
}
