class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref=strs[0];

        for(int i=0; i<strs.length; i++) {
            int j=0;
            while(j<Math.min(pref.length(), strs[i].length())){
                if(pref.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            pref=pref.substring(0,j);
        }
            return pref;
        }
        
    }