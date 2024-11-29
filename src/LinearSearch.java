public class LinearSearch {

    public static int getIndexOfNumberToBeFOund(int[] a, int key) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] == key) {
                return i;
            } 
            else if (a[i] > key) {
                return -1;
            }
        }
        return -1;
    }
}
