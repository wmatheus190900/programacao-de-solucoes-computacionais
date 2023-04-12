import java.util.Scanner;
public class Exercicio4Lis2 {
    public static void main(String[]aStrings){
    double altura,peso,imc;
    Scanner bot=new Scanner(System.in);
    System.out.println("altura e peso:");
    altura=bot.nextDouble();
    peso=bot.nextDouble();
    imc=peso/Math.pow(altura,2);
    if(imc<20){
        System.out.println("Abaixo do Peso");
    } 
    else if(imc>=20 && imc<25){
        System.out.println("Normal"); 
    }
    else if(imc>=25 && imc<30){
        System.out.println("Sobrepeso"); 
    }
    else if(imc>=30 && imc<40){
        System.out.println("Obesidade"); 
    }
    }
}
