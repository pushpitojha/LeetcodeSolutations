class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character c:magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Character c:ransomNote.toCharArray()){
            if(map.containsKey(c) && map.get(c)>0) {
                map.put(c, map.get(c)-1);
            } else {
                return false;
            }
        }
        return true;
    }
}