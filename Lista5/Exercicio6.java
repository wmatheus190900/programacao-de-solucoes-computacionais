package Lista5;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int idade;
        double media;
        int somaIdade=0;
        int numPessoas=0;
        for(int i=0;i<10;i++){
            System.out.println("Digite a idade");
            idade=bot.nextInt();
            somaIdade+=idade;
            numPessoas++;
        }
        media=somaIdade/numPessoas;
        System.out.println("media de idades: " + media);
        bot.close();
    }
}
