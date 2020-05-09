package info.victorchu.q9;

public class Palindrome {
    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) {
            return false;
        }
        int div = 1;

        while (x / div >= 10) {div *= 10;}

        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) { return false;}
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}