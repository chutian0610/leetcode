package info.victorchu.all.q8;

import org.junit.Assert;
import org.junit.Test;

public class MyAtoiTest {

    @Test
    public void myAtoi() {
        MyAtoi myAtoi = new MyAtoi();
        Assert.assertTrue(42 ==myAtoi.myAtoi("42"));
    }
}