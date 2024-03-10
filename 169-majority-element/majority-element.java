class Solution {
    public int majorityElement(int[] nums) {
        int curr = nums[0], count = 0;
        for(int i=0; i<nums.length; i++) {
            if(curr==nums[i]) {
                count++;
            } 
            else if(count==0) {
                curr=nums[i];
                count++;
            }
            else {
                count--;
            }
        }
        return curr;
    }
}