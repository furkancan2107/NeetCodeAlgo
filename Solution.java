package neetCode;

// bir dizide aynı sayıdan birden fazla varsa true döndüren program
public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[] case1 = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(case1));

    }

}
