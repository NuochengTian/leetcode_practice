/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 */
public class Solution004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1==null || nums2==null){
            int[] num = nums1==null? nums2:nums1;
            if (num.length%2==0){
                return (num[num.length/2]+num[num.length/2-1])/2;
            }
            else {
                return num[num.length/2];
            }
        }
        else {
            int n = nums1.length+nums2.length;
            int[] nums = new int[n];
            int i=0,j=0,k=0;
            while(i<nums1.length&&j<nums2.length){
                if(nums1[i]>nums2[j]) nums[k++]=nums2[j++];
                else nums[k++]=nums1[i++];
            }
            while(i<nums1.length) nums[k++]=nums1[i++];
            while(j<nums2.length) nums[k++]=nums2[j++];
            if(n%2==0) return Double.valueOf(nums[n/2-1]+nums[n/2])/2.0;
            else return Double.valueOf(nums[n/2]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,3,4,5};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
