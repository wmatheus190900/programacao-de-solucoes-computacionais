import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
		int valor;
		Scanner bot=new Scanner(System.in);
		System.out.print("valor: ");
		valor=bot.nextInt();
		for (int i = 0; i < 11; i++){
			System.out.println(valor + " X "+ i + " = " + (valor*i) );
			
		bot.close();
		}
	}
    
}
