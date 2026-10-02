package Recursion;
import java.util.ArrayList;
class Solution {
    public void generate(int n, int l, int r, String s,ArrayList<String> ans){
        if (s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        
        generate(n,0,0,"",ans);
        return ans;
        
    }
}
