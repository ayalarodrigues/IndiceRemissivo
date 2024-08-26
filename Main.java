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

        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
