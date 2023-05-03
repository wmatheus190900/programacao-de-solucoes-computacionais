package Lista3;
import java.util.Scanner;
public class Exercicio1Lista3 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        int[] notas = new int[30];
        int[] faltas = new int[30];
        int numAlunos = 0;
        int reprovadosNotas = 0;
        int reprovadosFaltas = 0;
        int maiorNota=0;
        int menorNota=100;
        int mais90 = 0;
        int mediaNotas=0;
        int somanotas=0;

        while(numAlunos<30){
        System.out.println("Digite a nota final e o número de faltas de cada aluno (digite uma nota negativa para encerrar):");
            int nota = bot.nextInt();
            if(nota<0){
                break;
            }
            int falta = bot.nextInt();

            notas[numAlunos] = nota;
            faltas[numAlunos] = falta;
            numAlunos++;
            if (nota >= 90) {
                mais90++;
            } else if (nota < 70) {
                reprovadosNotas++;
            }
            if (falta >= 20) {
                reprovadosFaltas++;
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }         
            somanotas+=nota;
        }
        
        System.out.println("quantidade de alunos com a nota maior que 90: " + mais90);
        System.out.println("reprovaodos por nota: " + reprovadosNotas);
        System.out.println("reprovaodos por falta: " + reprovadosFaltas);
        System.out.println("maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        mediaNotas=somanotas/numAlunos;
        System.out.println("Média das Notas: " + mediaNotas);
        bot.close();

    }
}


