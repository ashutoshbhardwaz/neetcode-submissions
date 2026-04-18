class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int maxCount=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int  count=1;
                int val=i;
                while(set.contains(val+1)){
                    count++;
                    val++;
                }
                maxCount=Math.max(maxCount,count);
            }
            
        }
        return maxCount;
    }
}
