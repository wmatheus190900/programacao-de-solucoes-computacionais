import java.util.Scanner;
public class Exercicio9Lista2 {
    public static void main(String[]args){
        // fiz 2 vetores pra colocar o tipo
        double v0,t,g,h,v;
        Scanner bot=new Scanner(System.in);
        String [] planetas= {"mercurio","venus","terra", "marte ", "jupiter ", "saturno ", "urano ", "netuno ", "plutao"};
        double [] gravidades = {3.7,8.8,9.8,3.8,26.4,11.5,9.3,12.2,0.6};
          
        System.out.println("Digite o nome do planeta(sem pontuação)");
        String planeta=bot.nextLine();
        int linhaPlaneta= -1;
        for(int i=0; i<planetas.length; i++){
            if(planetas[i].equalsIgnoreCase(planeta)){
                linhaPlaneta= i;
                break;
            }
        }
        if(linhaPlaneta != -1){
            g= gravidades[linhaPlaneta];
            System.out.println("Digite a velocidade inicial e um instante t");
            v0=bot.nextDouble();
            t=bot.nextDouble();
            v=v0-(g*t);
            h=(v0*t)-(g*Math.pow(t, 2))/2;
            System.out.println("velodade:" + v + "\naltura no instante " + t +" seg: " + (-h) + " metros.");

        }
        bot.close();
    }
}

    

    
