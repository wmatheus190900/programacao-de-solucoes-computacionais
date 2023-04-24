import java.util.Scanner;
public class Exercicio11Lista2 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        double total;
        int diaria;
        
        System.out.println("quantas diarias?");
        diaria=bot.nextInt();
        if(diaria<15){
            total=(500.00*diaria)+(15.00*diaria);
            System.out.println("valor total= " + "R$" + total);
        }else if(diaria==15){
            total=(500.00*diaria)+(10.00*diaria);
            System.out.println("valor total= " + "R$" + total); 
        }else if(diaria>15){
            total=(500.00*diaria)+(5.00*diaria);
            System.out.println("valor total= " + "R$" + total);
        }
        bot.close();
    }
    
}
