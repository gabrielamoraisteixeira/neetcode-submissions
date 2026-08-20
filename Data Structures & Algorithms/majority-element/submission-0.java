class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int x=nums.length/2;
        int num=0;

        for(int n: nums) {
            frequency.put(n, frequency.getOrDefault(n,0)+1);
        }

        for(int k: frequency.keySet()){
            if(frequency.get(k) > x){
                num=k;
            }
        }
        return num;
    }
}