public class Exercicio4 {
    int[] dados = new int[10];
    int tamanho = 0;

    public void adicionar(int valor) {
        dados[tamanho]= valor;
        tamanho++;
    }
    public boolean contem(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
