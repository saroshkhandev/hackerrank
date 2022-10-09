// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Sortings {
    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 7, 2, 9, 1};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
    }

    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;;
                }
            }
        }
    }

    // QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] =  arr[high];
        arr[high] = temp;

        return i;
    }

    // Merge Sort

    public static void divide(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            conquer(arr, start, mid, end);
        }
    }

    public static void conquer(int[] arr, int start, int mid, int end) {
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        int[] merged = new int[end - start + 1];

        while(idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for(int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}