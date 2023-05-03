import java.util.Scanner;
public class Exercicio3Lista3 {
    public static void main(String[] args) {
        Scanner bot = new Scanner(System.in);
        int[] canais = {2, 4, 5, 7, 12}; 
        int[] audiencias = {0, 0, 0, 0, 0};
        int total=0,porcentagem;
        int canal=-1;
        while(canal!=0){
            System.out.println("Digite o canal:");
            canal=bot.nextInt();
            if(canal==0){
                break;
            }
            System.out.println("adiência dos canais");
            int indiceCanal=-1;
            for(int i=0;i<canais.length;i++){
                if(canais[i]==i){
                indiceCanal=i;
                break;
                }else{
                    break;
                }
            }
            System.out.println("audiência do canal: ");
            int audiencia=bot.nextInt();
            audiencias[indiceCanal]+=audiencia;
            total+=audiencia;
        }
    }
}