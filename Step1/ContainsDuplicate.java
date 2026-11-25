import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.print(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> found = new HashSet<>();

        for(Integer num : nums) {
            if(!found.add(num)) {
                return true;
            }
            else {
                found.add(num);
            }
        }
        return false;
    }
}