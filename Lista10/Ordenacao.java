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
   	public static void quicksort(int[] vetor, int esquerda, int direita) {

		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);

		}

	}

	public static int particao(int[] vetor, int esquerda, int direita) {

		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;

		while (true) {
			do {
				i++;
			} while (vetor[i] < pivot);
			do {
				j--;
			} while (vetor[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}

	public static void mergeSort(int[] vetor) {
		if (vetor.length <= 1) {
			return;
		}

		int meio = vetor.length / 2;
		int[] esquerda = new int[meio];
		int[] direita = new int[vetor.length - meio];

		for (int i = 0; i < meio; i++) {
			esquerda[i] = vetor[i];
		}
		for (int i = meio; i < vetor.length; i++) {
			direita[i - meio] = vetor[i];
		}

		mergeSort(esquerda);
		mergeSort(direita);

		merge(esquerda, direita, vetor);
	}

	private static void merge(int[] left, int[] right, int[] array) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < leftLength) {
			array[k++] = left[i++];
		}

		while (j < rightLength) {
			array[k++] = right[j++];
		}
    }
}
