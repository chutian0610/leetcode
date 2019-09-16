package info.victorchu.q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays0() {
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        Assert.assertEquals(2.0d,new MedianOfTwoSortedArrays().findMedianSortedArrays(num1,num2),0.0001d);
    }

    @Test
    public void findMedianSortedArrays1() {
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        Assert.assertEquals(2.5d,new MedianOfTwoSortedArrays().findMedianSortedArrays(num1,num2),0.0001d);
    }
}