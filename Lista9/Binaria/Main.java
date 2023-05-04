package Lista9.Binaria;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    
        Scanner bot = new Scanner(System.in);
        int inteiros[] = new int[10];
        String confirma;

        for (int i = 0; i <inteiros.length; i++) {
            System.out.printf("Informe um numero[%d]: ", i);
            inteiros[i] = bot.nextInt();

        }
        Arrays.sort(inteiros);
        System.out.println();
        do {
            System.out.println("Informe o valor a ser procurado: ");
            int v = bot.nextInt();

            Busca.buscaBinaria(inteiros, v);

            System.out.println("Gostaria de continuar? (Sim ou Não)");
            confirma = bot.next();

        } while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));
        
        bot.close();
        System.exit(0);
    }
}
    

