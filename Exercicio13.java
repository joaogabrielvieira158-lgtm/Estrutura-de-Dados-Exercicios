public class Exercicio13 {
    String[] dados = new String[10];
    int tamanho = 0;
    public void adicionar (String valor){
            dados[tamanho] = valor;
            tamanho++;

    }
    public boolean substituir(String antigo,String novo){
        for (int i = 0; i <tamanho ; i++) {
            if (dados[i].equals(antigo)) {

                dados[i] = novo;
                return true;
            }
        }
        return false;

    }
    public void imprimir(){
        for (int i = 0; i <tamanho ; i++) {
            System.out.println(dados[i]);

        }
    }
}
