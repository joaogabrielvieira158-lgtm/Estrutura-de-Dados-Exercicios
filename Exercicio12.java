public class Exercicio12 {
    String[] dados = new String[10];
    int tamanho = 0;

    public void adicionar(String valor) {
        dados[tamanho] = valor;
        tamanho++;
    }
    public int contar(String valor){
        int contador = 0;
        for (int i = 0; i <tamanho; i++) {
            if (dados[i].equals(valor)){
                contador++;
            }

        }
        return contador;
    }
}

