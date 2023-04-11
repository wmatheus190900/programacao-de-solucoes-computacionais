import java.util.Scanner;
public class Exercicio3Lis2 {
    public static void main(String[]args){
        double nota1,nota2,nota3,media;
        Scanner bot=new Scanner(System.in);
    do {
        System.out.println("digite a nota 1:");
        nota1=bot.nextDouble();

        if(nota1<0 || nota1>10)
        System.out.println("valores de 0 a 10 por favor");
    }while(nota1<0 || nota1>10);
    
    
    do {
        System.out.println("digite a nota 2:");
        nota2=bot.nextDouble();

        if(nota2<0 || nota2>10)
        System.out.println("valores de 0 a 10 por favor");
    }while(nota2<0 || nota2>10);
    
    
    do {
        System.out.println("digite a nota 3:");
        nota3=bot.nextDouble();

        if(nota3<0 || nota3>10)
        System.out.println("valores de 0 a 10 por favor");
    }while(nota3<0 || nota3>10);
     media=(nota1+nota2+nota3)/3;
       
    if(media>=0 && media<3){
        System.out.println("reprovado");
    }
    else if(media>=3 && media<7){
        System.out.println("exame");
    }
    else if(media>=7 && media<=10){
        System.out.println("aprovado");
    }
    bot.close();
    }
    
}
