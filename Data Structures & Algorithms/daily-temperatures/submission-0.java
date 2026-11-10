class Solution {
    private class node{
        int val;
        int idx;
        node(int v , int i){
            val=v;
            idx=i;
        }
    }
    public int[] dailyTemperatures(int[] te) {
        Deque<node> stack = new ArrayDeque<>();
        int[] res= new int[te.length];
        for(int i=0;i<te.length;i++){
            if(stack.isEmpty()){
                stack.push(new node(te[i],i));
            } else {
                node n =stack.peek();
                    while(!stack.isEmpty() &&  n.val < te[i]) {
                        node fe= stack.pop();
                        res[fe.idx]=i-fe.idx;
                        n = stack.peek();    
                    } 
                  stack.push(new node(te[i],i));   
                
            }
        }
        return res;
    }
}


