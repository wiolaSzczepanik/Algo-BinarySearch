public class MyBinarySearch {

    public void sortArray(int[] array) {
        int sizeArray = array.length;
        int temp = 0;

        for (int i = 0; i < sizeArray; i++) {
            for (int j = 1; j < sizeArray-i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public boolean searchValue(int value, int[]array){
        int low = 0;
        int hight = array.length-1;


        while(hight>=low){
            int middle = (low+hight)/2;

            if(array[middle] == value){
                return true;
            }
            if(array[middle] > value){
                hight=middle-1;
            }
            if(array[middle] < value){
                low= middle +1;
            }
        }
        return false;
    }

    public String displayArray(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        return result;
    }


}
