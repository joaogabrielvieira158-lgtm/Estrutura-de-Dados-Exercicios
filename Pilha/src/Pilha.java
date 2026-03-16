
public class Pilha {
    // Atributos
    private String[] elementos;
    private int tamanho;

    // Construtor
    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    // Métodos
    public void empilha(String elemento) {
        if (!estaCheio()) {
            elementos[tamanho] = elemento;
            tamanho = tamanho + 1;
        } else {
            throw new IllegalStateException("A pilha está Cheia!");
        }
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaCheio() {
        if (tamanho == elementos.length) {
            return true;
        } else {
            return false;
        }
    }

    public String topo() {
        if (estaVazia()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    public String desempilha() {
        if (estaVazia()) {
            return null;
        }
        String ultimoElemento = elementos[tamanho - 1];
        tamanho = tamanho - 1;
        return ultimoElemento;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String resultado = "[";

        for (int i= 0; i < tamanho; i = i + 1) {
            resultado = resultado + elementos[i];

            if (i < tamanho - 1) {
                resultado = resultado + ", ";
            }
        }
        resultado = resultado + "]";
        return resultado;
    }
}
