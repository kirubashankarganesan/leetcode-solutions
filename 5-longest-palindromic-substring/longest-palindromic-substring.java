class Solution {
    static boolean isvalid(String ss) {
        int st = 0;
        int end = ss.length() - 1;
        while (st < end) {
            if (ss.charAt(st) != ss.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        String res="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i ; j < s.length(); j++) {
                String temp=s.substring(i, j + 1);
                if (isvalid(temp)&&temp.length()>res.length()) {
                  res=temp;
                }
            }
        }
       
        return res;
    }
}