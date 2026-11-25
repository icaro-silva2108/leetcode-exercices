import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;
        System.out.print(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();
        int[] solution = new int[2];

        for(int i = 0; i <= nums.length - 1; i++) {

            int diff = target - nums[i];
            if (seen.containsKey(diff)) {
                solution[0] = seen.get(diff);
                solution[1] = i;
                return solution;
            }
            seen.put(nums[i], i);
        }

        return solution;
    }
}