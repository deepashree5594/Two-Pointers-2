// TC: O(N) - > N is the length of nums arrays
// SC: O(1)
// Did it run successfully on Leetcode? : Yes
class Solution {
    public int removeDuplicates(int[] nums) {
        if( nums == null || nums.length == 1)
           return nums.length;
      
        int count = 1;
        int j = 1;
        for ( int i = 1; i <nums.length; i++)
        {
            if (nums[i] == nums[i-1])
                count++;
            else
                count = 1;
            
            if ( count <=2 )
            {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
