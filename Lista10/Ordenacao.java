package Lista10;

public class Ordenacao {
    public void bolha(int[] vetor) {
        int tamanho = vetor.length;
        boolean troca;
        
        for (int i = 0; i < tamanho - 1; i++) {
            troca = false;
            
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                }
            }
        }	
	}
	public void selecao(int[] vetor) {
        int tamanho = vetor.length;
        
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMinimo = i;
            
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            int temp = vetor[i];
            vetor[i] = vetor[indiceMinimo];
            vetor[indiceMinimo] = temp;
        }
	}
	public void insercao(int[] vetor) {
        int tamanho = vetor.length;
        
        for (int i = 1; i < tamanho; i++) {
            int chave = vetor[i];
            int j = i - 1;
            
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            
            vetor[j + 1] = chave;
        }
    }
}
