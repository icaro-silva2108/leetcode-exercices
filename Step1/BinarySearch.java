public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        System.out.print(binarySearch(nums, target));
    }

    public static int binarySearch(int[] nums, int target) {

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        if(nums[leftPointer] == target) {
            return leftPointer;
        }
        if(nums[rightPointer] == target) {
            return rightPointer;
        }

        while(leftPointer <= rightPointer) {

            int middlePointer = (leftPointer + rightPointer) / 2;

            if(nums[middlePointer] == target) {
                return middlePointer;
            }
            if(target > nums[middlePointer]) {
                leftPointer = middlePointer + 1;
            }
            if(target < nums[middlePointer]) {
                rightPointer = middlePointer - 1;
            }
        }
        return -1;
    }
}