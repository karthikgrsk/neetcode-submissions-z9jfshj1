/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        Collections.sort(intervals, (a,b) ->{
            if(a.start == b.start)
              return a.end - b.end;
            return a.start - b.start;   
    });

        for(int i=0;i<n-1;i++){
                if(intervals.get(i+1).start <= intervals.get(i).start){
                    return false;
                }
                if(intervals.get(i+1).start < intervals.get(i).end){
                    return false;
                }
            
        }

        return true;
    }
}
