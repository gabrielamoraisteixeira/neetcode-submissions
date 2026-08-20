
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> max = null;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (max == null || entry.getValue() > max.getValue()) {
                    max = entry;
                }
            }

            res[i] = max.getKey();
            map.remove(max.getKey());
        }

        return res;
    }
}
