import java.util.Scanner;
public class Exercicio2Lista3 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int nota1,nota2,nota3;
        int matricula=1;
        double media;
        
        while(matricula>0){
            System.out.print("Informe a Matrícula: ");
            matricula=bot.nextInt();
            if(matricula<0){
                break;
            }
            System.out.println("Informe as 3 notas: ");
            nota1=bot.nextInt();
            nota2=bot.nextInt();
            nota3=bot.nextInt();
            media=(nota1+nota2+nota3)/3.0;
            if(media>=70){
                System.out.println("Aprovado!");
            }
            else if(media>=60 && media<70){
                System.out.println("Recuperação.");
            }
            else if(media<60){
                System.out.println("Reprovado!");
            }
        }
        bot.close();
    }
    
}

