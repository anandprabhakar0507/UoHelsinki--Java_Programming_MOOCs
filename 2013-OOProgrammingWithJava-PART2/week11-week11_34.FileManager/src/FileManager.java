
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String>  result = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        while (reader.hasNextLine())
            result.add(reader.nextLine());
        return result;
    }

    public void save(String file, String text) throws IOException {
        FileWriter f = new FileWriter(file);
        f.write(text + '\n');
        f.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter f = new FileWriter(file, true);
        for (String text : texts)
            f.write(text+'\n');
        f.close();
    }
}
