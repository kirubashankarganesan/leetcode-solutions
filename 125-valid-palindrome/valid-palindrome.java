class Solution {
    public boolean isPalindrome(String s) {
        
        String ss="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ss+=s.charAt(i);
            }
        }
        int st=0;
        int end=ss.length()-1;
        while(st<end){
            char c1=Character.toLowerCase(ss.charAt(st));
            char c2=Character.toLowerCase(ss.charAt(end));
            if(c1!=c2){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}