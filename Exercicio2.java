public class Exercicio2 {
    int[]dados = new int[10];
    int tamanho = 0;
    public int ultimo() {
        if (tamanho == 0) {
            throw new IllegalStateException("vetor esta vazio");
        }
        return dados[tamanho -1];
    }
}


