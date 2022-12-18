package neetCode;

import java.util.Arrays;

// int[] nums={1,2,3,4} target 3 ise bana 0,1 içeren diziyi döndürsün nums[0] + nums[1]
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && target == nums[i] + nums[j]) {
                    a[0] = j;
                    a[1] = i;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 8 };
        int target = 6;
        System.out.println(Arrays.toString(Two_Sum.twoSum(nums, target)));
    }

}
