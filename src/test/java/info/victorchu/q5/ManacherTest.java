package info.victorchu.q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManacherTest {

    @Test
    public void longestPalindrome1() {
        String result = new Manacher().longestPalindrome("babad");
        Assert.assertTrue(
                "bab".equals(result)
                        || "aba".equals(result)
        );
    }

    @Test
    public void longestPalindrome2() {
        String result = new LongestPalindromicSubstring1().longestPalindrome("cbbd");
        Assert.assertTrue(
                "bb".equals(result)
        );
    }
}