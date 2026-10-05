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
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> {
            if (a.start != b.start) {
                return Integer.compare(a.start, b.start);
            }
            return Integer.compare(a.end, b.end);
        });

        if (intervals.isEmpty()) {
            return 0;
        }

        int rooms = 1;
        PriorityQueue<Integer> nextFree = new PriorityQueue<>(
            (a,b) -> Integer.compare(a,b)
        );

        for (Interval i : intervals) {
            if (nextFree.peek() != null && nextFree.peek() > i.start){
                rooms++;
            } else if (nextFree.peek() != null && nextFree.peek() <= i.start){
                nextFree.remove();
            }
            nextFree.add(i.end);



        }
        return rooms;
    }
}
