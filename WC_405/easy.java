// Problem link: https://leetcode.com/problems/find-the-encrypted-string/
class Solution {
    public String getEncryptedString(String s, int k) {

        
        int n = s.length();
        StringBuilder enc= new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            enc.append(s.charAt((i + k) % n));
        }

        return enc.toString();
    }
}