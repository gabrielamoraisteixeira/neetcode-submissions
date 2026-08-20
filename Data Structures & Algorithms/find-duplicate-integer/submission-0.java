class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result=0;

        for(int n:nums){
        if(map.containsKey(n)) {
            result= map.get(n);
        }
        map.put(n, n);
        }

        return result;
    }
}
