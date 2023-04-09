import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		double tc,tf;
		Scanner bot=new Scanner(System.in);
		System.out.print("qual temperatura em C?");
		tc=bot.nextDouble();
		tf=(tc*1.8)+32;
		System.out.print(tf+" F");
		bot.close();
	}
    
}
