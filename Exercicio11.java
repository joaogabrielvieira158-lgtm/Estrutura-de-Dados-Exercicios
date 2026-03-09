public class Exercicio11 {
    String[] dados = new String[10];
    int tamanho = 0;
    public void adicionar (String valor){
        dados[tamanho]= valor;
        tamanho++;

    }
    public void limpar(){
        tamanho = 0;
    }
    public void imprimir(){
        for (int i = 0; i <tamanho ; i++) {
            System.out.println(dados[i]);

        }
    }
}
