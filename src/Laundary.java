public class Laundary {
    public static int checkMoney(int sMoney, int[] notes) {
        int count = Integer.MIN_VALUE;
        for(int i = 0; i < notes.length; i++) {
            int sum = notes[i];
            count = 1;
            for(int j = i + 1; j < notes.length; j++) {
                sum += notes[j];
                count++;
                if(sum == sMoney)
                    break;
            }
            if(sum == sMoney) {
                break;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        System.out.println(checkMoney(33, arr));
    }


}
