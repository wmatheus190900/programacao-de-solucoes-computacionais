package Lista2;
import java.util.Scanner;
public class Exercicio7Lista2 {
    public static void main(String[] args) {
       double a,b,c,delta,x,x1,x2;
       Scanner bot=new Scanner(System.in);
       System.out.println("valores de a,b e c,respectvamente: "); 
        a=bot.nextDouble();
        b=bot.nextDouble();
        c=bot.nextDouble();
        if(a==0 && b==0 && c==0){
            System.out.println("igualdade confirmada: 0=0");
        }
        else if(a==0 && b==0 && c!=0){
            System.out.println("Coeficientes informados incorretamente.");
        }
        else if(a==0 && b!=0){
            x=-c/b;
            System.out.println("Esta é uma equação do primeiro grau");
            System.out.println("X= " + x);
        }
        else if(a!=0){
            System.out.println("Esta é uma equação de segundo grau");
            delta= (b*b)-4*a*c;
            if(delta<0){
                System.out.println("Ess equação não possui raízes reais");
            }
            else if(delta==0){
                x=-b/(2*a);
                System.out.println("esta equação possui duas raízes iguais:");
                System.out.println("X= "+ x);
            }
            else if(delta>0){
                System.out.println("Essa equação possui duas raízes diferentes");
                x1=(-b +Math.sqrt(delta))/(2*a);
                x2=(-b -Math.sqrt(delta))/(2*a);
                System.out.println("X'= "+ x1 + "    X''= " + x2);

            }
        bot.close();
        }
    }
}
