class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int x = nums.length/3;

        for(int n:nums) {
            freq.put(n, freq.getOrDefault(n, 0)+1);
            if(freq.get(n) > x && !res.contains(n)){
                res.add(n);
            }
        }
        return res;
    }
}