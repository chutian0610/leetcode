package info.victorchu.q1;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = new TwoSum().twoSum(nums,9);
        int[] expect = new int[]{0,1};
        assertArrayEquals(expect,result);
    }

    @Test
    public void twoSum2() {
        int[] nums = new int[]{3,2,4};
        int[] result = new TwoSum().twoSum(nums,6);
        int[] expect = new int[]{1,2};
        assertArrayEquals(expect,result);
    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();
    @Test
    public void twoSumError() {
        int[] nums = new int[]{2, 7, 11, 15};
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("No two sum solution");
        int[] result = new TwoSum().twoSum(nums,10);

    }
}