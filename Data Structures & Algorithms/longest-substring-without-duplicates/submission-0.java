class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int l=0;
        int res=0;

        for(int i=0; i<s.length(); i++) {
            while(unique.contains(s.charAt(i))){
                unique.remove(s.charAt(l));
                l++;
            }
            unique.add(s.charAt(i));
            res=Math.max(res, i-l+1);
        }

        return res;
        
    }
}
