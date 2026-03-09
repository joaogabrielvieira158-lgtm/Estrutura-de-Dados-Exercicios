 public class Exercicio5 {
        int[]dados = new int[10];
        int tamanho = 0;
        public void adicionar(int valor ){
            dados[tamanho] = valor;
            tamanho ++;
        }
        public void imprimirVetor(){
            System.out.print("[");
            for (int i = 0; i < tamanho; i++){
                System.out.print(dados[i]);
                if (i < tamanho - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        public void imprimirElemento(){
            for (int i = 0; i< tamanho; i++){
                System.out.println(dados[i]);
            }
        }
    }


