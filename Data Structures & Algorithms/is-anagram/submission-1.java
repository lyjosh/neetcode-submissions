class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> sCharMap = new HashMap<>();
        Map<Character, Integer> tCharMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sCharMap.put(s.charAt(i), sCharMap.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0;  i < t.length(); i++){
            tCharMap.put(t.charAt(i), tCharMap.getOrDefault(t.charAt(i), 0)+1);
        }
        return sCharMap.equals(tCharMap);
    }
}
