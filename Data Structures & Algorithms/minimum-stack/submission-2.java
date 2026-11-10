class MinStack {

    private static class Node{
        int val, min;
        Node next;
        Node(int v, int m,Node next){
            val=v;
            min=m;
            this.next=next;
        }
    }
    private Node head;
    //List<Integer> stack, stackmin;
    public MinStack() {
        // stack = new ArrayList<>();
        // stackmin = new ArrayList<>();
    }
    
    public void push(int val) {
        head= head==null? new Node(val,val,null) : new Node(val,Math.min(val,head.min),head);
        //stack.add(val);
        // if(stackmin.isEmpty()) { 
        //     stackmin.add(val);
        // } else {
        //     stackmin.add(Math.min(stackmin.get(stackmin.size()-1),val));
        // }
    }
    
    public void pop() {
        if (head==null) return;
        head = head.next;
    }
    
    public int top() {
       return head.val;
    }
    
    public int getMin() {
         return head.min;
    }
}
