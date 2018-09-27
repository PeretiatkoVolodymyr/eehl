package task1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String source = Utils.readFromFile(System.getProperty("user.dir") + "/backend/src/main/java/task1/textExample.txt");

        List<String> result = Utils.getListOfWords(source, " ", ";.,/-;:");

        result = Utils.removeDuplicateElements(result);

        System.out.println(result);

    }

}
