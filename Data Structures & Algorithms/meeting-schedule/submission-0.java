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

        intervals.sort((a,b) -> Integer.compare(a.start, b.start));
        int lastEnd = 0;
        for (Interval i : intervals) {
            if (lastEnd > i.start) {
                return false;
            }

            lastEnd = i.end;
        }
        return true;

    }
}
