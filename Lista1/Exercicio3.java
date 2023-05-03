package Lista1;
import java.util.Scanner;;
public class Exercicio3 {
    public static void main(String[] args) {
		float cotr,valord,valorr;
		Scanner bot= new Scanner(System.in);
		System.out.print("cotação do dolar: ");
		cotr= bot.nextFloat();
		System.out.print("valor que tem em dolares: ");
		valord=bot.nextFloat();
		valorr= valord*cotr;
		System.out.print("voce tem "+ valorr + " reais.");
	    	bot.close();
	}
}
