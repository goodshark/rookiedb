package edu.berkeley.cs186.database.common;

import edu.berkeley.cs186.database.databox.DataBox;

import java.util.List;

public class Util {
    public static Pair<Integer, Boolean> findTarget(List<DataBox> list, DataBox target) {
        int left = 0, right = list.size();
        while (left < right) {
            int pivot = (left + right) / 2;
            int compareResult = list.get(pivot).compareTo(target);
            if (compareResult < 0)  {
                left = pivot + 1;
            } else if (compareResult == 0) {
                return new Pair<>(pivot, true);
            } else {
                right = pivot;
            }
        }
        return new Pair<>(left, false);
    }
}
