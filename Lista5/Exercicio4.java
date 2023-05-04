package Lista5;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
		int idade;
		int somaIdade=0,quantNum=0;
		double mediaIdade;
		Scanner bot=new Scanner(System.in);
			for(; ;){
			System.out.println("Digite a idade:");
			idade=bot.nextInt();
			if(idade<=0){
				break;
			}else{
				somaIdade+=idade;
				quantNum++;
			}
		}
		mediaIdade=somaIdade/quantNum;
		System.out.println("média: " + mediaIdade);	
		bot.close();
	}
    
}
