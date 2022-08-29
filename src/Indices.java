import java.util.Arrays;
import java.util.Scanner;

public class Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        int target = sc.nextInt();
        int[] result = indices(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] indices(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }
}
