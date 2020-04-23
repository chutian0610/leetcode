package info.victorchu.q8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAtoiTest {

    @Test
    public void myAtoi() {
        MyAtoi myAtoi = new MyAtoi();
        Assert.assertTrue(42 ==myAtoi.myAtoi("42"));
    }
}