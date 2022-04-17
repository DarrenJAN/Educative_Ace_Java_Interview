package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Merge_Intervals {
    class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    };

    class MergeIntervals {

        public static List<Interval> merge(List<Interval> intervals) {
            List<Interval> mergedIntervals = new LinkedList<Interval>();
            // TODO: Write your code here
            Collections.sort(intervals, (a, b)->(a.start - b.start));
            Interval pre = null;
            for(Interval interval: intervals)
            {
                if(pre == null)
                    pre = interval;
                else
                {
                    if(interval.start > pre.end)
                    {
                        mergedIntervals.add(pre);
                        pre = interval;
                    }else
                    {
                        pre.end = Math.max(pre.end, interval.end);
                    }
                }
            }
            mergedIntervals.add(pre);
            return mergedIntervals;
        }

        public static void main(String[] args) {

        }
    }
}
