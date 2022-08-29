import java.util.Arrays;

public class Sorting {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if(startIndex >= endIndex)
            return;
        int pivotPos = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotPos - 1);
        quickSort(input, pivotPos + 1, endIndex);
    }

    public static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        int pivotPos = startIndex;
        int count = 0;
        for(int i = startIndex + count; i < endIndex; i++) {
            if(input[i] < pivot) {
                int temp = input[i];
                input[i] = pivot;
                input[pivotPos] = temp;

                pivotPos = startIndex + count;
                count++;
            }
        }
        return pivotPos;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 3, 6, 7, 5, 4};
        quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
