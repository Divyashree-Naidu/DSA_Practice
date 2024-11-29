public class BinarySeach {

    public static int searchForKey(int[] a, int key) {
        int size = a.length;
        int s = 0;
        int e = size-1;
        int mid;

        while(s <= e) {
            mid = (s+e)/2;
            if (a[mid] == key) {
                return mid;
            }
            else if (key > a[mid]) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;        
    }



}
