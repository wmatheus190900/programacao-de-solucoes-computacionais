package Lista3;
import java.util.Scanner;
public class Exercicio4Lista3 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        double salario,somaSalario=0,mediaSal,mediaFil;
        int filho,somaFilhos=0,numPessoas=0;
        while(true){
            System.out.println("quanto você rece de salário?-Informe um valor negativo para finalizar o programa-");
            salario=bot.nextDouble();
            somaSalario+=salario;
            if(salario<0){
                break;
            }
            System.out.println("número de filhos:"); 
            filho=bot.nextInt();
            somaFilhos+=filho;
            numPessoas++;
        }
        mediaFil=somaFilhos/numPessoas;
        mediaSal=somaSalario/numPessoas;
        System.out.println("media salarial: " + "R$" + mediaSal + "\nmedia de filhos:" + mediaFil);
        
        bot.close();
    }
    
}
