class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sorts = s.toCharArray();
        char[] sortt = t.toCharArray();

        Arrays.sort(sorts);
        Arrays.sort(sortt);

        for(int i = 0; i < s.length(); i++) {
            if(sorts[i] != sortt[i]) {
                return false;
            }
        }
        return true;
    }
}
