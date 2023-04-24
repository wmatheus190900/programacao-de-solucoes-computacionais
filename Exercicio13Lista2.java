import java.util.Scanner;
public class Exercicio13Lista2 {
    public static void main(String[] args) {
       Scanner bot=new Scanner(System.in);
       String apto,simples="simples",duplo="duplo";
       int diaria;
       double total;
       System.out.println("tipo de apartamento(simples ou duplo) e quantidade de dias:");
       apto=bot.nextLine();
       diaria=bot.nextInt();
       if(apto.equalsIgnoreCase(simples)){
            if(diaria<10){
                total=diaria*100.00;
                System.out.println("R$" + total);
            }else if(diaria>=10 && diaria<=15){
                total=diaria*90.00;
                System.out.println("R$"+ total);
            }else if(diaria>15){
                total=diaria*80.00;
                System.out.println("R$"+ total);
            }
        }else if(apto.equalsIgnoreCase(duplo)){
            if(diaria<10){
                total=diaria*140.00;
                System.out.println("R$" + total);
            }else if(diaria>=10 && diaria<=15){
                total=diaria*120.00;
                System.out.println("R$"+ total);
            }else if(diaria>15){
                total=diaria*100.00;
                System.out.println("R$"+ total);
            }
        }
    }
}
