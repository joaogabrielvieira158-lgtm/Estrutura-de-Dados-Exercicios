public class Main {
    public static void main(String[] args) {
        Pilha pilha01 = new Pilha(10);

        pilha01.empilha("A");
        pilha01.empilha("B");
        pilha01.empilha("C");

        System.out.println("Topo: " + pilha01.topo());
        System.out.println("Removido: " + pilha01.desempilha());
        System.out.println("Topo: " + pilha01.topo());

        System.out.println("--------------------");

        String palavra = "Hello";

        Pilha pilha02 = new Pilha(palavra.length());

        for (int letra = 0; letra < palavra.length(); letra = letra + 1) {
            pilha02.empilha(String.valueOf(palavra.charAt(letra)));
        }

        System.out.println("Normal: " + pilha02);

        String invertido = "";

        while (!pilha02.estaVazia()) {
            invertido = invertido + pilha02.desempilha();
        }

        System.out.println("Invertido: " + invertido);

        System.out.println("--------------------");

        String palavra02 = "arara";

        Pilha pilha03 = new Pilha(palavra02.length());

        for (int letra = 0; letra < palavra02.length(); letra = letra + 1) {
            pilha03.empilha(String.valueOf(palavra02.charAt(letra)));
        }

        System.out.println("Normal: " + pilha03);

        String invertido02 = "";

        while (!pilha03.estaVazia()) {
            invertido02 = invertido02 + pilha03.desempilha();
        }

        System.out.println("Invertido: " + invertido02);

        if (palavra02.equals(invertido02)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        System.out.println("--------------------");

        String frase = "eu gosto de java";
        String[] palavras = frase.split(" ");

        Pilha pilha04 = new Pilha(palavras.length);

        for (int palavra03 = 0; palavra03 < palavras.length; palavra03++) {
            pilha04.empilha(palavras[palavra03]);
        }

        System.out.println("Frase Normal: " + pilha04);

        String fraseInvertida = "";

        while (!pilha04.estaVazia()) {
            fraseInvertida = fraseInvertida + pilha04.desempilha() + " ";
        }

        System.out.println("Frase Invertida: " + fraseInvertida);
    }
}
