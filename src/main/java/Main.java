public class Main {
    public static void main(String[] args) {
        int[]array = {23,43,12,1,434,6565,332,12,656,87};

        MyBinarySearch binarySearch = new MyBinarySearch();
        binarySearch.sortArray(array);
        System.out.println(binarySearch.displayArray(array));

        boolean result = binarySearch.searchValue(23, array);
        System.out.println(result);
    }
}
