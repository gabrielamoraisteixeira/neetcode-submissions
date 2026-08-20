class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int x=nums.length/2;
        int num=0;
        int maxCount=0;

        for(int n: nums) {
            frequency.put(n, frequency.getOrDefault(n,0)+1);
            if(frequency.get(n) > maxCount) {
                num=n;
                maxCount = frequency.get(n);
            }
        }
        return num;
    }
}