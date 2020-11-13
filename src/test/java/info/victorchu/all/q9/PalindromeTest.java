package info.victorchu.all.q9;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Assert.assertTrue(new Palindrome().isPalindrome(1002001));
    }

    @Test
    public void isPalindrome1() {
        Assert.assertFalse(new Palindrome().isPalindrome(100201));
    }
}