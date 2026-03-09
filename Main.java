import javax.xml.transform.Source;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*
        exercicio 1
    Exercicio1 vetor = new Exercicio1();

 System.out.println(vetor.estaVazio());
    /*

         */
        /*exercicio 2
        Exercicio2 vetor = new Exercicio2();
        vetor.dados[0] = 10;
        vetor.dados[1] = 20;
        vetor.tamanho = 2;
        System.out.println(vetor.ultimo());
        /*

         /*
        Exercicio3
        Exercicio3 vetor = new Exercicio3();
        vetor.dados[0]= 10;
        vetor.dados[1]= 20;
        vetor.dados[2]= 30;
        vetor.tamanho = 3;
        vetor.imprimir();

       */
        /*
        Exercicio4

        Exercicio4 vetor = new Exercicio4();
        vetor.adicionar(10);
        vetor.adicionar(20);
        vetor.adicionar(30);
        System.out.println(vetor.contem(20));
        System.out.println(vetor.contem(5));

         */

/* 5
    Exercicio5
    Exercicio5 vetor = new Exercicio5();
    vetor.adicionar(10);
    vetor.adicionar(20);
    vetor.adicionar(30);
    System.out.println("o tamanho do vetor é = " +vetor.tamanho);
    vetor.imprimirVetor();
    vetor.imprimirElemento();
 */

        /*
        exercicio 6
        Exercicio6 vetor = new Exercicio6 ();
        vetor.adicionar("ana");
        vetor.adicionar("carlos");
        vetor.adicionar("marcos");
        vetor.adicionar("sara");
        System.out.println(vetor.contem("ana"));
        System.out.println(vetor.contem("carlos"));

        System.out.println(vetor.busca("marcos"));
        System.out.println(vetor.busca("sara"));
         */
        /*
        exercicio7
        Exercicio7 vetor = new Exercicio7();
                try {
                    System.out.println(vetor.ultimo());
                }catch(IllegalStateException e){
                    System.out.println("Erro " + e.getMessage());
                }
                vetor.adicionar(10);
                vetor.adicionar(20);
                vetor.adicionar(30);
                System.out.println("ultimo elemento:"+ vetor.ultimo());

         */
        /*
    Exercicio8 vetor = new Exercicio8();
        vetor.adicionar(10);
        vetor.adicionar(20);
        vetor.adicionar(30);
        System.out.println("ultimo antes de zerar"+ vetor.ultimo());

        vetor.zerar();

    try {
        System.out.println("ultimo antes de zerar " + vetor.ultimo());
    } catch (IllegalStateException e){
        System.out.println("erro"+ e.getMessage());
    }

         */

    /*
    exercicio9
        Exercicio9 vetor = new Exercicio9();
        vetor.adicionar(10);
        vetor.adicionar(20);
        vetor.adicionar(10);
        vetor.adicionar(30);
        vetor.adicionar(10);
        int quantidade = vetor.contar(10);
        System.out.println("O numero 10 aparece "+ quantidade   +  " vezes");
     */
        Exercicio10 vetor = new Exercicio10();
        vetor.adicionar("maça");
        vetor.adicionar("antigo");
        vetor.adicionar("banana");
        vetor.adicionar("antigo");
        vetor.substitua("antigo","novo");
        vetor.mostrar();


    }
}
