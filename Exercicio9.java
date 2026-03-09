public class Exercicio9 {
    int[] dados = new int[10];
    int tamanho = 0;

    public void adicionar(int valor) {
        dados[tamanho] = valor;
        tamanho++;
    }

    public int ultimo() {
        if (tamanho == 0) {
            throw new IllegalStateException("vetor vazio");
        }
        return dados[tamanho - 1];
    }

    public void zerar() {
        tamanho = 0;
    }

    public int contar(int valor) {
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == valor) {
                contador++;
            }
        }
        return contador;
    }
}
