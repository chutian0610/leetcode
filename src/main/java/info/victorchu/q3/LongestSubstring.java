package info.victorchu.q3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length =s.length();
        int max = 0;
        int before =0;
        int subStart = 0; // 子串开始的位置
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < length; j++) {
            if (map.containsKey(s.charAt(j))) { // 已经出现过的字符
                before = map.get(s.charAt(j));
                subStart = Math.max(before,subStart); // 确认是否重复
            }
            max = Math.max(max,j-subStart+1);
            map.put(s.charAt(j), j + 1);
        }
        return max;
    }
}
