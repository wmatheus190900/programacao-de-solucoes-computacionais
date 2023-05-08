package Lista3;
import java.util.Scanner;
public class Exercicio1Lista3 {
    public static void main(String[] args) {
        int totalNota=0,notaFinal,maiorNota=0,menorNota=100,faltas,quant90=0,quantRepN=0,quantRepF=0,numAlunos=0;
        double mediaTotal;
        Scanner bot=new Scanner(System.in);
        do{
            System.out.println("nota final: ");
            notaFinal=bot.nextInt();
            numAlunos++;
            if(notaFinal<0){
                break;
            }else{
            System.out.println("faltas:");
            faltas=bot.nextInt();
            totalNota+=notaFinal;
            if(notaFinal>90){
                quant90++;
            }
            else if(notaFinal<70){
                quantRepN++;
            }
            if(notaFinal>maiorNota){
                maiorNota=notaFinal;
            }
            if(notaFinal<menorNota){
                menorNota=notaFinal;
            }
            if(faltas>20){
                quantRepF++;
            }
            }
        }while(notaFinal>=0);
        System.out.println("Quantidade de alunos com nota>=90: "+ quant90);
        System.out.println("Quantidade de alunos reprovados por nota: "+ quantRepN);
        System.out.println("Quantidade de alunos reprovados por falta: " + quantRepF);
        System.out.println("Maior nota:"+ maiorNota);
        System.out.println("Menor nota:"+ menorNota);
        mediaTotal=totalNota/numAlunos;
        System.out.println("média total da turma: "+ mediaTotal);
    }
}


