package info.victorchu.offer.q3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int item:nums) {
            if(map.containsKey(item)){
                Integer value = map.get(item);
                return item;
            }else {
                map.put(item,1);
            }
        }
        return -1;
    }
}