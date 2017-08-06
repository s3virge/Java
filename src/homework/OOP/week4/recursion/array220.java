package homework.OOP.week4.recursion;

/**
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that
 value times 10. We'll use the convention of considering only the part of the array that begins at the given index.
 In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

 array220([1, 2, 20], 0) → true
 array220([3, 30], 0) → true
 array220([3], 0) → false
 */

public class array220 {
    public static void main(String[] args) {

        System.out.printf("array220([20, 2, 21], 0) → %b\n",  array220(new int[]{20, 2, 21}, 0));
        System.out.printf("array220([1, 2, 20], 0) → %b\n",  array220(new int[]{1, 2, 20}, 0));
        System.out.printf("array220([3, 30], 0) → %b\n",  array220(new int[]{3, 30}, 0));
        System.out.printf("array220([3], 0) → %b\n",  array220(new int[]{3}, 0));
        System.out.printf("array220([], 0) → %b\n",  array220(new int[]{}, 0));
    }

    public static boolean array220(int[] nums, int index) {

        if (nums.length == 0) {
            return false;
        }

        if (index == nums.length - 1)
        {
            return false;
        }

        if (nums[index + 1] % 10 == 0){
            if (nums[index] == nums[index + 1] / 10 ){
                return true;
            }
        }

        return array220(nums, index + 1);
    }

}
