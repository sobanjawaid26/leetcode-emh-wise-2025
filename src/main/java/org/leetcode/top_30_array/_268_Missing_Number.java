package org.leetcode.top_30_array;

public class _268_Missing_Number {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int res = missingNumber(nums);
        System.out.println("res : " + res);
    }

    public static int missingNumber(int[] nums) {
        int size = nums.length;
        System.out.println("size : " + size);
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < size;i++){
            System.out.print(nums[i]);
            sum1 += nums[i];
        }
        System.out.println();

        for(int i = 1; i <= size;i++){
            System.out.print(i);
            sum2 += i;
        }
        System.out.println();
        System.out.println(sum1);
        System.out.println(sum2);
        return sum2 - sum1;
        // [1,2,3,4,5]
        // [2,0,4,1,5]
    }
}
