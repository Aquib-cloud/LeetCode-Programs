class Solution {
    public int removeDuplicates(int[] nums) {
        int available = 1;
        int i;

        for (i = 1 ; i < nums.length ; i++) 
        {
            if (nums[i] != nums[i - 1]) 
            {
                nums[available] = nums[i];
                available++;
            }
        }
        return available;
    }
}