package Stack;

import java.util.ArrayList;
class MinStack {
    ArrayList<Integer> stack; 
    ArrayList<Integer> minstack;
    public MinStack() {
      stack = new ArrayList<>();
      minstack = new ArrayList<>();
    }
    
    public void push(int value) {
        stack.add(value);
        if(minstack.size()==0){
            minstack.add(value);
        }
        else{
            int min = Math.min(value,minstack.get(minstack.size()-1));
            minstack.add(min);
        }
    }
    public void pop() {
        stack.remove(stack.size() - 1);
    minstack.remove(minstack.size() - 1);
    }
    public int top() {
        return stack.get(stack.size()-1);
        
    }
    
    public int getMin() {
        return minstack.get(minstack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */