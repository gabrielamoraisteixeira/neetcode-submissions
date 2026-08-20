class Solution {
    public boolean isPalindrome(String s) {
        
        int ptr1=0;
        int ptr2=s.length()-1;

        while(ptr1<ptr2){

            if(!Character.isLetterOrDigit(s.charAt(ptr1))) {
                ptr1++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(ptr2))) {
                ptr2--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(ptr1)) == Character.toLowerCase(s.charAt(ptr2))){
                ptr1++;
                ptr2--;
            } else {
            return false;
        } 

        }

        return true;
        
    }
}
