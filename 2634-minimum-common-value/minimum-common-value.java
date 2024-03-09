class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for(int i:nums1) {
            set.add(i);
        }
        for(int i:nums2) {
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
        // int x=0, y=0;
        // while(x<nums1.length && y<nums2.length) {
        //     if(nums1[x]==nums2[y]) {
        //         return nums1[x];
        //     } else if(nums1[x]>nums2[y]) {
        //         y++;
        //     } else {
        //         x++;
        //     }
        // }
        // return -1;
    }
}