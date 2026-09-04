class Solution {
    static boolean ispermutation(String t, String s1) {
        char[] ch1 = t.toCharArray();
        char[] ch2 = s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s2.charAt(i));
        }
        if (ispermutation(sb.toString(), s1)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s2.charAt(i));
            if (ispermutation(sb.toString(), s1)) {
                return true;
            }
        }
        return false;
    }
}