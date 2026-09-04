class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res="";
        String st=strs[0];
        String end=strs[strs.length-1];
        int i=0;
        while(i<st.length()&&i<end.length()){
            char ch1=st.charAt(i);
            char ch2=end.charAt(i);
            if(ch1!=ch2){
                break;
            }
            res+=st.charAt(i);
            i++;
        }
        return res;
    }
}