class MyHashSet {

class LinkNode{
    LinkNode next;
    int key;
    public LinkNode(int key){
        this.key=key;
        this.next=null;
    }
}

private final LinkNode[] hs;

    public MyHashSet() {
         hs = new LinkNode[100000];
        for (int i = 0; i < hs.length; i++) {
            hs[i] = new LinkNode(0);
        }
    }
    
    public void add(int key) {
        int k=key%100000;
        LinkNode ln=hs[k];
        while(ln.next!=null){
            if(ln.next.key == key)
            return;
            ln=ln.next;
        }
        ln.next= new LinkNode(key);
    }
    
    public void remove(int key) {
        int k=key%100000;
        LinkNode ln=hs[k];
        while(ln.next!=null){
            if(ln.next.key == key)
            ln.next=ln.next.next;
        }
    }
    
    public boolean contains(int key) {
        int k=key%100000;
        LinkNode ln=hs[k];
        while(ln.next!=null){
            if(ln.next.key == key)
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */