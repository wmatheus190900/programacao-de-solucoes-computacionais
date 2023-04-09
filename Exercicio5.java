import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
		double diagm,diagmaior,areat;
		Scanner bot= new Scanner(System.in);
		System.out.println("diagonal maior: ");
		diagmaior= bot.nextDouble();
		System.out.println("diagonal menor: ");
		diagm= bot.nextDouble();
		areat= (diagmaior*diagm)/2;
		System.out.println("área: "+ areat);
		bot.close();

	}
    
}
