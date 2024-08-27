import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Teste de leitura de arquivo
            List<String> linhas = ProcessadorTexto.lerArquivo("texto.txt");
            System.out.println("Conteúdo do arquivo lido:");
            for (String linha : linhas) {
                System.out.println(linha);
            }

            // Teste de criação de arquivo
            String caminhoNovoArquivo = "teste_criacao.txt";
            ProcessadorTexto.criarArquivo(caminhoNovoArquivo);
            System.out.println("Arquivo criado: " + caminhoNovoArquivo);

            // Teste de escrita em arquivo
            String conteudo = "Este é um teste de escrita em arquivo.";
            ProcessadorTexto.escreverArquivo(caminhoNovoArquivo, conteudo);
            System.out.println("Conteúdo escrito no arquivo: " + conteudo);

            // Teste da classe No
            No<String> no1 = new No<>("Primeiro nó");
            No<String> no2 = new No<>("Segundo nó");
            No<String> no3 = new No<>("Terceiro nó");

            no1.setProximo(no2);
            no2.setProximo(no3);

            System.out.println("Elemento do nó 1: " + no1.getElemento()); // Deve imprimir "Primeiro"
            System.out.println("Elemento do nó 2: " + no1.getProximo().getElemento()); // Deve imprimir "Segundo"
            System.out.println("Elemento do nó 3: " + no1.getProximo().getProximo().getElemento()); // Deve imprimir "Terceiro"

            no1.setElemento("Novo Primeiro");
            System.out.println("Novo elemento do nó 1: " + no1.getElemento()); // Deve imprimir "Novo Primeiro"

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
