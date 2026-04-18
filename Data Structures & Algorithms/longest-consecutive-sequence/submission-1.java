class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int value= nums[0];
        int count=1;
        int maxCount=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==value+1){
                count++;
                value=nums[i];
            }else if(nums[i]==value){
                continue;
            }else{
                maxCount=Math.max(maxCount,count);
                count=1;
                value=nums[i];
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
