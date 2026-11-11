class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[] speedAt= new int[target];
        for(int i=0;i<=position.length-1;i++){
             //System.out.println("hey" +i);
            speedAt[position[i]] = speed[i];
            // System.out.println(speedAt[i]);
        }
        Deque<Double> stack= new ArrayDeque<Double>(); 
        for(int i=target-1;i>=0;i--){
            //System.out.println(i);
            if(speedAt[i]!=0) {
                double timetaken = (double)(target-i)/speedAt[i];
                //System.out.println(timetaken);
            if (!stack.isEmpty() && stack.peek()>=timetaken) continue;
            //System.out.println(i);
            stack.push(timetaken);}
        }
        return stack.size();
    }
}
