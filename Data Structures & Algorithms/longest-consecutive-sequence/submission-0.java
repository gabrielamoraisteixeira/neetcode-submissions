
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;

        for (int num : nums) {
            map.put(num, num);
        }

        for (int num : nums) {
            if (!map.containsKey(num - 1)) { 
                int current = num;
                int count = 1;

                while (map.containsKey(current + 1)) {
                    current++;
                    count++;
                }

                if (count > longest) longest = count;
            }
        }

        return longest;
    }
}
