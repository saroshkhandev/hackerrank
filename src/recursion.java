import java.util.Arrays;

public class recursion {
    public static double findGeometricSum(int k) {
        // Write your code here
        if (k == 0) return 1.00000;
        double sol;
        sol = 1 / (Math.pow(2, k));

        return sol + findGeometricSum(k - 1);
    }

    public static String revString(int lastIndex, String input) {
        if (lastIndex < 0) return "";

        char ch = input.charAt(lastIndex);
        String smallAns = revString(lastIndex - 1, input);

        return ch + smallAns;
    }

    public static boolean isStringPalindrome(String input) {
        // Write your code here
        int length = input.length() - 1;
        String reverse = revString(length, input);
        return reverse.equals(input);
    }

    public static int countZeros(int input) {
        // Write your code here
        if (input == 0) return 0;
        int d = input % 10;
        int sum = 0;
        if (d == 0) sum = 1;
        int smallAns = countZeros(input / 10);

        return sum + smallAns;
    }

    public static int countZerosRec(int input) {
        // Write your code here
        if (input == 0) return 1;

        return countZeros(input);
    }


    public static String replace(String input) {
        // Write your code here
        if (input.length() <= 1) {
            return input;
        }

        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            return "3.14" + replace(input.substring(2, input.length()));
        }

        return input.charAt(0) + replace(input.substring(1, input.length()));
    }

    public static String removeX(String input) {
        // Write your code here
        if (input.length() == 0) {
            return input;
        }

        if (input.charAt(0) == 'x') {
            return "" + removeX(input.substring(1, input.length()));
        }

        return input.charAt(0) + removeX(input.substring(1, input.length()));
    }



    public static int convertStringToInt(String input) {
        if (input.length() == 1) {
            return input.charAt(0) - '0';
        }
        int smallOutput = convertStringToInt(input.substring(0, input.length() - 1));
        int lastDigit = input.charAt(input.length() - 1) - '0';
        return smallOutput * 10 + lastDigit;

    }

    public static String addStars(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String out = addStars(s.substring(1));
        if (s.charAt(0) == s.charAt(1)) {
            out = s.charAt(0) + "*" + s.charAt(1) + out.substring(1);

        } else {
            out = s.charAt(0) + out;
        }
        return out;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        if (nums[0] == nums[1]) {
            int[] smallInput = new int[nums.length - 2];
            System.arraycopy(nums, 2, smallInput, 0, nums.length - 2);
            return nums[0] + removeDuplicates(smallInput);
        }
        int[] smallInput = new int[nums.length - 1];
        System.arraycopy(nums, 1, smallInput, 0, nums.length - 1);
        return removeDuplicates(smallInput);
    }

    public static int omitDuplicate(int[] nums) {
        if (nums.length < 2) return nums.length;

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }

        return j + 1;
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() == 0)
            return input;

        if(input.charAt(0) == c1)
            return c2 + replaceCharacter(input.substring(1), c1, c2);

        return input.charAt(0) + replaceCharacter(input.substring(1), c1, c2);
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length() <= 1) {
            return "";
        }

        char c1, c2;

        c1 = s.charAt(0);
        c2 = s.charAt(1);

        if(c1 == c2) {
            return c2 + removeConsecutiveDuplicates(s.substring(2));
        }

        return c1 + removeConsecutiveDuplicates(s.substring(1));
    }

    public static void merge(int[] input, int startIndex, int endIndex) {
        int mid = (startIndex + endIndex) / 2;
        int i = startIndex;
        int j = mid + 1;
        int index = 0;
        int[] output = new int[endIndex - startIndex + 1];
        while(i <= mid && j <= endIndex) {
            if(input[i] < input[j]) {
                output[index] = input[i];
                i++;
                index++;
            } else {
                output[index] = input[j];
                j++;
                index++;
            }
        }

        while(i <= mid) {
            output[index] = input[i];
            i++;
            index++;
        }

        while(j <= endIndex) {
            output[index] = input[j];
            j++;
            index++;
        }

        System.arraycopy(output, 0, input, startIndex + 0, output.length);


    }

    public static void mergeSort(int[] input, int startIndex, int endIndex) {
        if(startIndex >= endIndex)
            return;

        int mid = (startIndex + endIndex) / 2;
//        Part 1
        mergeSort(input, startIndex, mid);
//        Part 2
        mergeSort(input, mid + 1, endIndex);

        merge(input, startIndex, endIndex);
    }
    
    

    public static void main(String[] args) {
        System.out.println(findGeometricSum(5));
        System.out.println(revString(5, "Sarosh"));
        System.out.println(countZerosRec(302010202));
        System.out.println(replace("xpix"));
        System.out.println(removeX("xaxsdfasvcxxxb"));
        System.out.println(convertStringToInt("001234"));
        System.out.println(addStars("aaaa"));
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(omitDuplicate(nums));

        System.out.println(replaceCharacter("abacd", 'a', 'x'));

        System.out.println(removeDuplicates(nums));
        int[] input = {3, 1, 9, 3, 5, 4, 6, 2};
        System.out.println(removeConsecutiveDuplicates("baabbsbbahsahbahshhbhsjjjj"));
        mergeSort(input, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }
}
