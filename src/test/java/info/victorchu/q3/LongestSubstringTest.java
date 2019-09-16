package info.victorchu.q3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring0() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3,longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void lengthOfLongestSubstring1() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(1,longestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void lengthOfLongestSubstring2() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assert.assertEquals(3,longestSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}