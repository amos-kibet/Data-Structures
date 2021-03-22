import java.util.Arrays;

/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number
 * (there is no guarantee that the 2 numbers exist) e.g.
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [2,7] because 2 and 7 adds up to 9
 * (we are supposed to return an array of size 2 containing the numbers).
 * We can use a two-pointer approach as below:
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // rightPointer starts from right moving left
        int rightPointer = n-1;
        // leftPointer starts from left moving right
        int leftPointer = 0;

        while (leftPointer < rightPointer) {
            int sum = nums[leftPointer] + nums[rightPointer];
            if (sum == target) {
                // return these numbers in an array
                return new int[] {nums[leftPointer], nums[rightPointer]};
            }else if (sum < target) {
                //we need to move leftPointer rightwise
                leftPointer ++;
            }else {
                // move rightPointer leftwise
                rightPointer --;
            }
        }
        // return null if the numbers were not found
        return null;
    }
}
