public class Exercicio8 {
    int[]dados = new int[10];
    int tamanho = 0;
    public void adicionar(int valor){
        dados[tamanho] = valor;
        tamanho++;
    }
    public int ultimo(){
        if (tamanho ==0) {
            throw new IllegalStateException("vetor vazio");
        }
        return dados[tamanho -1];

    }
    void zerar(){
            tamanho = 0;
    }
}
