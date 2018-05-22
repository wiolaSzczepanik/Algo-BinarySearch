import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBinarySearchTest {

    @Test
    public void testIfArrayIsSort(){
        MyBinarySearch binarySearch = new MyBinarySearch();
        int[] array = {1,10,2,9};
        binarySearch.sortArray(array);
        assertEquals("1 2 9 10 ",binarySearch.displayArray(array));
    }

}