package Lista3;
import java.util.Scanner;
public class Exercicio3Lista3 {
    public static void main(String[] args) {
        Scanner bot = new Scanner(System.in);
        int canal2=0;
        int canal4=0;
        int canal5=0;
        int canal7=0;
        int canal12=0;
        int audiencia=0;
        int totalaud=0;
        int opcao=-1;
        do{
            System.out.println("escolha o canal(2;4;5;7;12)");
            opcao=bot.nextInt();
            switch(opcao){
                case 2:
                System.out.println("quanto de adiencia?");
                audiencia=bot.nextInt();
                canal2+=audiencia;
                totalaud+=audiencia;
                break;
                case 4:
                System.out.println("quanto de adiencia?");
                audiencia=bot.nextInt();
                canal4+=audiencia;
                totalaud+=audiencia;
                break;
                case 5:
                System.out.println("quanto de adiencia?");
                audiencia=bot.nextInt();
                canal5+=audiencia;
                totalaud+=audiencia;
                break;
                case 7:
                System.out.println("quanto de adiencia?");
                audiencia=bot.nextInt();
                canal7+=audiencia;
                totalaud+=audiencia;
                break;
                case 12:
                System.out.println("quanto de adiencia?");
                audiencia=bot.nextInt();
                canal12+=audiencia;
                totalaud+=audiencia;
                break;
            }
        }while(opcao!=0);
        
        System.out.println("canal 2 tem " + canal2*100/totalaud + "% de audiência.");
        System.out.println("canal 4 tem " + canal4*100/totalaud + "% de audiência.");
        System.out.println("canal 5 tem " + canal5*100/totalaud+ "% de audiência.");
        System.out.println("canal 7 tem " + canal7*100/totalaud + "% de audiência.");
        System.out.println("canal 12 tem " + canal12*100/totalaud + "% de audiência.");
        bot.close();
    }
}