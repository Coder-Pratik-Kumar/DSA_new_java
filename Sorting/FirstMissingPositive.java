import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] < n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(nums));

        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return n + 1;
    }
}
