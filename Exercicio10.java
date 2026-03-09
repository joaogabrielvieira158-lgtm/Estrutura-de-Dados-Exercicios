public class Exercicio10 {
    String[] dados = new String[10];
    int tamanho = 0;
    public void adicionar(String valor){
        dados[tamanho] = valor;
        tamanho++;
    }
    public void substitua(String antigo,String novo){
        for (int i = 0; i < tamanho ; i++) {
            if(dados[i].equals(antigo)){
                dados[i] = novo;
                break;//para depois da primeira substituiçao
            }
        }
    }
    public void mostrar(){
        for (int i = 0; i < tamanho ; i++) {
            System.out.println(dados[i]);
            
        }
    }
}
