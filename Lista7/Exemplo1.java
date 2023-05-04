package Lista7;
import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {

        int i, j;
        Scanner bot = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (i = 0; i < matriz.length; i++)
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe um número: ");
                matriz[i][j] = bot.nextInt();
            }

        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++)
                System.out.printf("%2d ", matriz[i][j]);
            System.out.println();
        }
        System.out.println("Elementos das linhas ímpares e colunas pares:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 1 && j % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        for (i = 0; i < matriz.length; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = temp;
        }

        System.out.println("Matriz com diagonais trocadas:");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++)
                System.out.printf("%2d ", matriz[i][j]);
            System.out.println();
        }
        
    }
}    

