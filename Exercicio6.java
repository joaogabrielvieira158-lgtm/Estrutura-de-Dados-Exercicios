public class Exercicio6 {
    String[] dados = new String[10];
    int tamanho = 0;

    public void adicionar(String valor) {
        dados[tamanho] = valor;
        tamanho++;
    }

    public boolean contem(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i].equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public int busca(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }
}
