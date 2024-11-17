import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m+n];
        int o = nums3.length;
        System.arraycopy(nums1, 0, nums3, 0, m);
        System.arraycopy(nums2, 0, nums3, m, n);
        Arrays.sort(nums3);

        if(o%2!=0)
            return nums3[o/2];
    
        return (nums3[o/2-1]+nums3[o/2])/2.0;
    }
}