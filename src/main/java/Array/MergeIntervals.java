package Array;

import java.util.ArrayList;
import java.util.Collections;

// Creating a tuple class as java does not support returning
// multiple arguments
class Pair {
    public int first;
    public int second;

    public Pair(int x, int y) {
        this.first = x;
        this.second = y;
    }
}

class MergeIntervals {
    static ArrayList<Pair> mergeIntervals(ArrayList<Pair> v) {
        ArrayList<Pair> result = new ArrayList<Pair>();
        Pair pre = null;
        Collections.sort(v, (a,b) -> (a.first - b.first));

        for(int i  = 0 ;i < v.size();i++)
        {
            Pair cur = v.get(i);

            if(pre == null)
                pre = cur;
            else {
                if (cur.first > pre.second) {
                    result.add(pre);
                    pre = cur;
                } else
                {
                    pre.second = Math.max(pre.second, cur.second);
                }
            }

        }
        result.add(pre);
        return result;
    }
}