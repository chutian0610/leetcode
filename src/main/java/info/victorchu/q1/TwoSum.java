package info.victorchu.q1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Version 1.0
 * @Description Leetcode Question: two-sum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dic = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            Integer pair = target - nums[i];
            if(dic.containsKey(pair)){
                return new int[]{dic.get(pair),i};
            }
            dic.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
