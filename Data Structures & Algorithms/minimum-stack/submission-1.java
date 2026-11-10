class MinStack {
    List<Integer> stack, stackmin;
    public MinStack() {
        stack = new ArrayList<>();
        stackmin = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(stackmin.isEmpty()) { 
            stackmin.add(val);
        } else {
            stackmin.add(Math.min(stackmin.get(stackmin.size()-1),val));
        }
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        stackmin.remove(stackmin.size()-1);
    }
    
    public int top() {
       return stack.get(stack.size()-1);
    }
    
    public int getMin() {
          return stackmin.get(stackmin.size()-1);
    }
}
