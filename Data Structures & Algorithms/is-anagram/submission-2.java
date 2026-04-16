class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(Character i: s.toCharArray()) {
            mapS.put(i, mapS.getOrDefault(i, 0) + 1);
        }
        for(Character i: t.toCharArray()) {
            mapT.put(i, mapT.getOrDefault(i, 0) + 1);
        }
        return mapS.equals(mapT);
    }
}
