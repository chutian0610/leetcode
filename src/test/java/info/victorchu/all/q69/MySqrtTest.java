package info.victorchu.all.q69;

import org.junit.Assert;
import org.junit.Test;

public class MySqrtTest {
    @Test
    public void mySqrt1() {
        Assert.assertTrue(2== new MySqrt().mySqrt(8));
    }

    @Test
    public void mySqrt2() {
        Assert.assertTrue(3== new MySqrt().mySqrt(9));
    }

    @Test
    public void mySqrt3() {
        Assert.assertTrue(3== new MySqrt().mySqrt(10));
    }
}
