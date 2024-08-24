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
}
