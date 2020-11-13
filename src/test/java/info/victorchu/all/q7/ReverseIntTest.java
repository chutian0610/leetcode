package info.victorchu.all.q7;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntTest {

    @Test
    public void reverse10() {
        Assert.assertTrue(12345 == new ReverseInt().reverse1(54321));
    }

    @Test
    public void reverse11() {
        Assert.assertTrue(12345 == new ReverseInt().reverse1(543210));
    }

    @Test
    public void reverse12() {
        Assert.assertTrue(0 == new ReverseInt().reverse1(2147483647));
    }


    @Test
    public void reverse20() {
        Assert.assertTrue(12345 == new ReverseInt().reverse2(54321));
    }
    @Test
    public void reverse21() {
        Assert.assertTrue(12345 == new ReverseInt().reverse2(543210));
    }


    @Test
    public void reverse22() {
        Assert.assertTrue(0 == new ReverseInt().reverse2(2147483647));
    }
}