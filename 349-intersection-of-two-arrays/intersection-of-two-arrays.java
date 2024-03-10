class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums1) set.add(i);
        List<Integer> res = new ArrayList<>();
        for(int i:nums2) {
            if(set.contains(i)) {
                res.add(i);
                set.remove(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}