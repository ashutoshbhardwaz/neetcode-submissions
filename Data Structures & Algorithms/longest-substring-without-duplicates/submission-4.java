class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        int left=0;
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i]) && map.get(ch[i])>=left){
                left=map.get(ch[i])+1;
                
            }
            map.put(ch[i],i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
