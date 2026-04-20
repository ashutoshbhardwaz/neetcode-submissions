class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int min=Integer.MAX_VALUE;
        for(int minv:prices){
            if(minv<min){
                min=minv;
            }else{
                maxP=Math.max(maxP, minv-min);
            }
            
        }
        return maxP;
    }
}
