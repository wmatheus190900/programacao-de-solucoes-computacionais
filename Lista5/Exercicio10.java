package Lista5;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int idade,contf=0;
        String sexo;
        for(int i=0;i<10;i++){
            System.out.println("Digite sexo e idade");
            sexo=bot.nextLine();
            idade=bot.nextInt();
            if(sexo.equalsIgnoreCase("f"))
                if(idade>=20 && idade<=40)
                    contf++;
        }
        System.out.println(contf);
        bot.close();
    }   
}
