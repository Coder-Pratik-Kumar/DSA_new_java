import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target);
        if(result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (target < arr[mid]) {
                end = mid - 1;  
            } else {
                start = mid + 1;  
            }
        }

        return -1;  
    }
}
