import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		double nota1,nota2,nota3,media;
		Scanner bot= new Scanner(System.in);
		System.out.print("nota 1: ");
		nota1= bot.nextDouble();
	    System.out.print("nota 2: ");
	    nota2= bot.nextDouble();
	    System.out.print("nota 3: ");
	    nota3= bot.nextDouble();
        media= (nota1+nota2+nota3)/3;
        System.out.print("sua média é : " + media);
        bot.close();
	}

}
