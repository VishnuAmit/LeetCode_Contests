// Problem link: https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/

class Solution {
    // // Brute force - tc: O(2^n) sc: O(2^n)
    // public static void helper(String s, int n, List<String> res){
    //     if(n==0){
    //         res.add(s);
    //         return;
    //     }
    //     helper(s+"1",n-1,res);
    //     helper(s+"0",n-1,res);
    // }
    
    public boolean isValid(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0' && s.charAt(i+1)=='0') return false;
        }
        return true;
    }
    public List<String> validStrings(int n) {
        // String s="";
        // List<String> res=new ArrayList<>();
        // List<String> validones=new ArrayList<>();
        // helper(s,n,res);
        // for(String temp:res){
        //     if(isValid(temp)){
        //         validones.add(temp);
        //     }
        // }
        // return validones;


        // Optimal - tc: O(2^n) sc: O(2^n)
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }


        List<String> current = new ArrayList<>();
        current.add("1");
        current.add("0");

        for (int i = 2; i <= n; i++) {
            List<String> next = new ArrayList<>();
            for (String s : current) {

                next.add(s + "1");
                if (!s.endsWith("0")) {
                    next.add(s + "0");
                }
            }
            current = next;
        }

        for (String s : current) {
            if (isValid(s)) {
                result.add(s);
            }
        }

        return result;
    }
}