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

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(intervals.get(j).start <= intervals.get(i).start){
                    return false;
                }
                if(intervals.get(j).start < intervals.get(i).end){
                    return false;
                }
            }
        }

        return true;
    }
}
