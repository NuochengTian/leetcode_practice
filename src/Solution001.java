
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *

 */
class Solution001 {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,9};
        int target = 16;
        int[] result = twoSum(nums,target);
        for (int i:result){
            System.out.println(i);
        }
    }
}