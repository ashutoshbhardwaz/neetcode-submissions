class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb= new StringBuilder();
       for(String st:strs){
       sb.append(st.length()).append("#").append(st);
       }
       return sb.toString();
    }

    public List<String> decode(String str) {
        int length=str.length();
        int i=0;
        int j;
        List<String> list= new ArrayList<>();
        while(i<length){
            j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int n=Integer.parseInt(str.substring(i,j));
            String word= str.substring(j+1,j+1+n);
            list.add(word);
            i=j+n+1;
        }
        return list;
    }
}
