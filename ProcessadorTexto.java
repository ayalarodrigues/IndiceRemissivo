import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessadorTexto {

    public static void lerArquivo(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + nomeArquivo + ": " + e.getMessage());
        }
    }
}