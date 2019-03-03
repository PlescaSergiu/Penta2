import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteToFile {


    public void writeToFile(String path, List<String> list) throws IOException {

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            for (String w : list) {
                writer.write(w + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
