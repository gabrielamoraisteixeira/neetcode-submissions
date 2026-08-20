class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int n = nums.length;
        for(int num: nums){
            uniqueNumbers.add(num);
        }

        return n!=uniqueNumbers.size();    
    }
}