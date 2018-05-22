import org.junit.jupiter.api.BeforeEach;
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

    @Test
    public void testIfArrayIsSort2(){
        MyBinarySearch binarySearch = new MyBinarySearch();
        int[] array = {1,10,0,2,-5,-3,9,-9};
        binarySearch.sortArray(array);
        assertEquals("-9 -5 -3 0 1 2 9 10 ",binarySearch.displayArray(array));
    }

    @Test
    public void testIfValueExistInArray(){
        MyBinarySearch binarySearch = new MyBinarySearch();
        int[] array = {1,10,2,9};
        binarySearch.sortArray(array);
        assertEquals(true, binarySearch.searchValue(9,array));
    }
    @Test
    public void testIfFirstElementWillBeFound(){
        MyBinarySearch binarySearch = new MyBinarySearch();
        int[] array = {1,10,2,9};
        binarySearch.sortArray(array);
        assertEquals(true, binarySearch.searchValue(1,array));
    }

}