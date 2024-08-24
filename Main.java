import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "texto.txt"; //caminho do arquivo

        try {
            List<String> linhas = ProcessadorTexto.lerArquivo(caminhoArquivo);
            System.out.println("Conteúdo do arquivo " + caminhoArquivo + ":");
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + caminhoArquivo + ": " + e.getMessage());
        }
    }
}
