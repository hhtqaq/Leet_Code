import java.util.Arrays;

/**
 * @author hht
 * @date 2021/3/9 17:21
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, 5, 8, 22, 22, 23, 38, 49, 65, 76, 972};

        int num = 23; // 在数组中查找的数
        int index = nonBinarySearch(arr, num, 0, arr.length - 1);
        System.out.print(num + "在数组中的索引为: " + index);
    }

    public static int nonBinarySearch(int[] arr, int target, int start, int end) {

        int midIndex = (end + start) >> 1;

        if (target < arr[midIndex]) {

            return nonBinarySearch(arr, target, start, midIndex);

        } else if (target > arr[midIndex]) {

            return nonBinarySearch(arr, target, midIndex, end);

        } else {
            return midIndex;
        }
    }
}
