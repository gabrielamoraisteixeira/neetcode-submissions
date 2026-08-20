class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int max=0;

        while(r<prices.length){
            
            if(prices[l]>prices[r]){
                l=r;
            }else{
                int maxProfit=prices[r]-prices[l];
                max=Math.max(maxProfit, max);
                r++;
            }

        }

        return max    ;
       
 }
}
