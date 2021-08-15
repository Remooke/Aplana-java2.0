package Practice6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReaderWord {

    public static List<String> addSplitWords(String fileName) throws IOException {
        List<String> list = new ArrayList<String>();
        String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        String[] words = text.split(" ");
        for (int i = 0; i< words.length; i++){
            list.add(words[i].toUpperCase());
        }
        //System.out.println(list);
        return list;
    };
}
