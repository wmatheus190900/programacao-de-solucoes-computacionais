import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
		Scanner bot = new Scanner (System.in);
		int nasc,atual,idatual,idpos;
		System.out.print("ano de nascimento: ");
		nasc = bot.nextInt();
	    	System.out.print("em que ano estamos?");
		atual = bot.nextInt();
		idatual= atual-nasc;
		idpos=idatual+50;
		System.out.print("atualmente você tem " + idatual + " anos " + " e daqui 50 anos terá " + idpos+ " anos.");
		bot.close();
	}
    
}
