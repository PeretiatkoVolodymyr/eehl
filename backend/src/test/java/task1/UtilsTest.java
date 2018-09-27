package task1;

import org.junit.Test;
import task2.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void getListOfWords() {

        String source = "Andrew, Billy, Coddy";

        String exp[] = {"andrew", "billy", "coddy"};
        List<String> expected = Arrays.asList(exp);

        List<String> actual = Utils.getListOfWords(source, " ", ",");

        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicateElements() {

        String exp[] = {"A", "B", "C"};
        List<String> expected = Arrays.asList(exp);

        String act[] = {"A", "A", "B", "C", "C", "C", "A", "B"};
        List<String> actual = Arrays.asList(act);

        actual = Utils.removeDuplicateElements(actual);

        assertEquals(expected, actual);

    }
}