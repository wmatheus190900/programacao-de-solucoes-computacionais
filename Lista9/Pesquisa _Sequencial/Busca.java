package Lista9.Pesquisa _Sequencial;
import java.util.Scanner;
public class Busca {
    public static void buscarNumero(int[] numeros) {
        Scanner bot = new Scanner(System.in);

        int numeroProcurado = -1;
        while (numeroProcurado != 0) {
            System.out.println("Digite o número a ser procurado (0 para sair):");
            numeroProcurado = bot.nextInt();
            if (numeroProcurado == 0) {
                break;
            }
            System.out.println("Digite o tipo de busca (1 - Sequencial, 2 - Sequencial com Sentinela):");
            int tipoBusca = bot.nextInt();

            int posicao = -1;
            int comparacoes = 0;
            if (tipoBusca == 1) {
                for (int i = 0; i < 10; i++) {
                    comparacoes++;
                    if (numeros[i] == numeroProcurado) {
                        posicao = i;
                        break;
                    }
                }
            } else if (tipoBusca == 2) {
                int ultimo = numeros[15];
                numeros[15] = numeroProcurado;
                int i = 0;
                while (numeros[i] != numeroProcurado) {
                    comparacoes++;
                    i++;
                }
                numeros[15] = ultimo;
                if (i < 9 || numeros[15] == numeroProcurado) {
                    posicao = i;
                }
            } else {
                System.out.println("Tipo de busca inválido!");
            }

            if (posicao != -1) {
                System.out.println("Número encontrado na posição " + posicao + " com " + comparacoes + " comparações.");
            } else {
                System.out.println("Número não encontrado com " + comparacoes + " comparações.");
            }
        }

       bot.close();
    }
}
