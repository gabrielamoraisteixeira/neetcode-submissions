class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int res=1;

        for(int p:piles){
            high=Math.max(high, p);
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEat(piles, h, mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return res;
        
    }

    private static boolean canEat(int[] piles, int h, int mid){
        int hours=0;
        for(int p:piles){
            hours += Math.ceil((double)p /mid);
        }
        return hours<=h;
    }
}
