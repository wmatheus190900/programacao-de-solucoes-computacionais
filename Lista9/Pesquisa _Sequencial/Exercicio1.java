import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner bot = new Scanner(System.in);

        int[] inteiros = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            inteiros[i] = bot.nextInt();
        }

        Busca.buscarNumero(inteiros);

        bot.close();
    }
}
