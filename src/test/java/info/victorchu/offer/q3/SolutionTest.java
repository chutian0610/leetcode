package info.victorchu.offer.q3;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testFindRepeatNumber() {
        int[] input = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Solution().findRepeatNumber(input));
    }
}