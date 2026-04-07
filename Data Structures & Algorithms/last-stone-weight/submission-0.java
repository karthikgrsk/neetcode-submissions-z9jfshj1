class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer>  q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            q.add(i);
        } 
        // System.out.print(q.size());
        while(q.size() > 1){
             printQueue(q);
            int x = q.poll();
            int y = q.poll();
             
            if(x > y) q.add(Math.abs(y-x));
            else if(x < y) q.add(y);

          
        }
          printQueue(q);
        return q.isEmpty() ? 0 : q.poll();
    }

    public static void printQueue(Queue<Integer> q) {
        System.out.print("Queue elements: ");
        for (int ele : q) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
