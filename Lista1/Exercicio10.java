package Lista1;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
		double raio,comprimento,area,volume;
		Scanner bot=new Scanner(System.in);
		System.out.print("valor do raio: ");
		raio=bot.nextDouble();
		comprimento=2*Math.PI*raio;
		area=Math.PI*(raio*raio);
		volume=(4.0/3.0)*Math.pow(raio,3)*Math.PI;
		System.out.print("\ncomprimento: " + comprimento+"\narea: " + area + "\nvolume: " + volume);
		bot.close();
	}
}
