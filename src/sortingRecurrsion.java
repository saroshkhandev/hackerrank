public class sortingRecurrsion {
    public static boolean checkSorted(int input[]) {
        if(input.length <= 1)
            return true;

        int[] smallInput = new int[input.length - 1];
        System.arraycopy(input, 1, smallInput, 0, input.length - 1);

        boolean smallAns = checkSorted(smallInput);
        if(!smallAns) {
            return false;
        }
        return input[0] < input[1];
    }

    public static boolean checkSorted_2(int[] input) {
        if (input.length <= 1)
            return true;

        if(input[0] > input[1])
            return false;

        int[] smallInput = new int[input.length - 1];
        System.arraycopy(input, 1, smallInput, 0, input.length - 1);

        return checkSorted_2(smallInput);

    }

    public static boolean checkSortedBetter(int[] input, int startIndex) {
        if(startIndex >= input.length - 1)
            return true;

        if(input[startIndex] > input[startIndex + 1])
            return false;

        return checkSortedBetter(input, startIndex + 1);
    }

    private static int returnIndex(int[] input, int startIndex, int x) {
        if(input[startIndex] == x)
            return startIndex;
        if(startIndex >= input.length - 1) {
            if(input[startIndex] == x)
                return startIndex;
            else
                return -1;
        }
        return returnIndex(input, startIndex + 1, x);

    }

    public static int firstIndex(int[] input, int x) {
        int startIndex = 0;
        return returnIndex(input, startIndex, x);
    }

    private static int returnLastIndex(int[] input, int lastIndex, int x) {
        if(input[lastIndex] == x)
            return lastIndex;
        if(lastIndex <= 1) {
            if(input[lastIndex] == x)
                return lastIndex;
            else
                return -1;
        }

        return returnLastIndex(input, lastIndex - 1, x);
    }

    public static int lastIndex(int[] input, int x) {
        int lastIndex = input.length - 1;
        return returnLastIndex(input, lastIndex, x);
    }


    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 3, 6, 9};
        System.out.println(checkSorted(input));
        System.out.println(checkSortedBetter(input, 0));
        System.out.println(firstIndex(input, 11));
        System.out.println(lastIndex(input, 7));
    }
}
