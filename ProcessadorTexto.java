import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ProcessadorTexto {

    // Método para ler um arquivo e retornar uma lista de strings (linhas do arquivo)
    public static List<String> lerArquivo(String caminhoArquivo) throws IOException {
        Path path = Paths.get(caminhoArquivo);
        return Files.readAllLines(path);
    }

    // Método para escrever uma string em um arquivo
    public static void escreverArquivo(String caminhoArquivo, String conteudo) throws IOException {
        Path path = Paths.get(caminhoArquivo);
        Files.writeString(path, conteudo);
    }

    // Método para criar um arquivo, caso não exista
    public static void criarArquivo(String caminhoArquivo) throws IOException {
        Path path = Paths.get(caminhoArquivo);
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
    }
}
