package task2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayUtilTest {

    private static String[] array;
    private static List<String> expected, list;



    @Before
    public void setUp() throws Exception {
        array = new String[2];
        array[0] = "C";
        array[1] = "D";

        list = new ArrayList<>();
        list.add("A");
        list.add("B");

        expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        expected.add("D");
    }

    @Test
    public void fromArrayToCollection() {

        ArrayUtil.fromArrayToList(array, list);
        assertEquals(expected, list);

    }

}