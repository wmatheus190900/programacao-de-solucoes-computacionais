import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
		double catetoa,catetob,hip;
		Scanner bot=new Scanner(System.in);
		System.out.print("valor dos catetos: ");
		catetoa=bot.nextDouble();
		catetob=bot.nextDouble();
		hip= Math.sqrt((catetoa*catetoa)+(catetob*catetob));
		System.out.println("Hipotenusa: "+ hip);
		bot.close();
		
	}
}
