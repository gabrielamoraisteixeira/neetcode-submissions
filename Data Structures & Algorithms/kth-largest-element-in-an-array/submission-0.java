class Solution {
    PriorityQueue<Integer> minHeap;
    public int findKthLargest(int[] nums, int k) {

        this.minHeap=new PriorityQueue<>();

        for(int n:nums) {
            minHeap.offer(n);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }

        return minHeap.isEmpty()? 0: minHeap.peek();

    }
}
