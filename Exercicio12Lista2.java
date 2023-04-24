import java.util.Scanner;
public class Exercicio12Lista2 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        String sexo,homem="homem",mulher="mulher";
        int idade;
        System.out.println("sexo(homem/mulher) e idade");
        sexo=bot.nextLine();
        idade=bot.nextInt();
        if(sexo.equalsIgnoreCase(homem)){
            if(idade<=15){
                System.out.println("R$ 60,00");
            }else if(idade>=16 && idade<=18){
                System.out.println("R$ 75,00");
            }else if(idade>=19 && idade<=30){
                System.out.println("R$ 90,00");
            }else if(idade>=31 && idade<=40){
                System.out.println("R$ 85,00");
            }else if(idade>40){
                System.out.println("R$ 80,00");
            }
        }else if(sexo.equalsIgnoreCase(mulher)){
            if(idade<=18){
                System.out.println("R$ 60,00");
            }else if(idade>=19 && idade<=25){
                System.out.println("R$ 90,00");
            }else if(idade>=26 && idade<=40){
                System.out.println("R$ 85,00");
            }else if(idade>40){
                System.out.println("R$ 80,00");
            }
        }
        bot.close();    
    }
}