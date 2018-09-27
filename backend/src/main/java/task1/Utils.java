package task1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {

    public static String readFromFile(String filename) {

        StringBuffer sb = new StringBuffer();
        try (Stream<String> lines = Files.lines(Paths.get(filename), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> sb.append(line));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();

    }

    public static List<String> getListOfWords(String source, String delimiters, String ignoreChars){

        source = source.toLowerCase();
        source = source.replaceAll("["+ignoreChars+"]", "");

        return Collections.list(new StringTokenizer(source, delimiters))
                .stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());

    }

    public static List<String> removeDuplicateElements(List<String> source){
        return source.stream().distinct().collect(Collectors.toList());
    }

}
