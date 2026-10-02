package Stack;
import java.util.Stack;
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()> prices[i]){
                st.pop();
            }
            if(!st.isEmpty()) res[i] = (st.peek()- prices[i])*-1;
            else res[i] = prices[i];

            st.push(prices[i]);        
        }
        return res;


    }
}