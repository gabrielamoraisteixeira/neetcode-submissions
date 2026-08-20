class Solution {
    PriorityQueue<Integer> minHeap;
    public int lastStoneWeight(int[] stones) {
        int c=0;

        this.minHeap=new PriorityQueue<>();
        

        for(int s:stones){
            minHeap.offer(-s);
        }

        while(minHeap.size()>1){
            int x=-minHeap.poll();
            int y=-minHeap.poll();

            int diff=Math.abs(x-y);
            if(diff > 0) {
                minHeap.offer(-diff);
            }
        }

        return minHeap.isEmpty()? 0: -minHeap.peek();
        
    }
}
