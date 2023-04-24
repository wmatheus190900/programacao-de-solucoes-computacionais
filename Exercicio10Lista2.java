import java.util.Scanner;
public class Exercicio10Lista2 {
    public static void main(String[]args){
        Scanner bot=new Scanner(System.in);
        int num1,num2,num3;
        int digite;
        System.out.print("escolha:\n1 - Somar os dois números.\n2 - Multiplicar os dois números.\n3 - Subtrair o número maior pelo número menor.\n4 - Dividir o primeiro número pelo segundo.");
        digite=bot.nextInt();
        System.out.print("Escolha 2 numeros");
        num1=bot.nextInt();
        num2=bot.nextInt();
        switch(digite){
            case 1:
                num3=num1+num2;
                System.out.println(num1+ " + " + num2 + " = " + num3);
                break;
            case 2:
                num3=num1*num2;
                System.out.println(num1 + " x " + num2 + " = " + num3);
                break;
            case 3:
                if(num1>num2){
                    num3=num1-num2;
                    System.out.println(num1 + " - " + num2 + " = " + num3);
                }else if(num2>num1){                   
                 num3=num2-num1;
                 System.out.println(num2 + " - " + num1 + " = " + num3);
                }else if(num1==num2){
                    System.out.println("0");
                }
                break;
            case 4:
                if(num2==0){
                    System.out.println("não existe divisão por 0");
                }else{
                        num3=num1/num2;
                        System.out.println(num1 + "/" + num2 + " = " + num3);
                }
                break;
        }
        bot.close();
    }

}
