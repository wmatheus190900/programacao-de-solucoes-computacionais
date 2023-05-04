package Lista8;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dividendo:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o divisor:");
        int num2 = scanner.nextInt();

        Divisao divisao = new Divisao();

        try {
            double resultado = divisao.dividir(num1, num2);
            System.out.println(num1 + "/" + num2 + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
    
}
