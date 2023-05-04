package Lista5;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int peso,contf=0,contm=0;
        String sexo;
        for(int i=0;i<10;i++){
            System.out.println("Digite sexo e peso");
            sexo=bot.nextLine();
            peso=bot.nextInt();
            if(sexo.equalsIgnoreCase("F"))
                if(peso>=50 && peso<=70)
                    contf++;
            else if(sexo.equalsIgnoreCase("M"))
                if(peso>=60 && peso<=80)
                contm++;
        }
        System.out.println("quantidade de pessoas do sexo masculino que possuem peso entre 60 e 80 kg: " + contm);
        System.out.println("quantidade de pessoas do sexo feminino que possuem peso entre 50 e 70 kg: " + contf);
        bot.close();
    }   
    
}
