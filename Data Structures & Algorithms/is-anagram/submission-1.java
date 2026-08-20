class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> sChars = new ArrayList<>();
        List<Character> tChars = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            sChars.add(s.charAt(i));
        }

        for(int i=0; i<t.length(); i++ ){
        tChars.add(t.charAt(i));
        }

        Collections.sort(sChars);
        Collections.sort(tChars);
        return sChars.equals(tChars);

    }
}
