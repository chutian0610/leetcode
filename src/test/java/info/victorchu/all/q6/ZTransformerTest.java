package info.victorchu.all.q6;

import org.junit.Assert;
import org.junit.Test;

public class ZTransformerTest {

    @Test
    public void convert1() {
        String s= "LEETCODEISHIRING";
        int numRows = 4;
        ZTransformer zTransformer = new ZTransformer();
        String result = "LDREOEIIECIHNTSG";
        Assert.assertEquals(result,zTransformer.convert(s,numRows));
    }

    @Test
    public void convert2() {
        String s= "LEETCODEISHIRING";
        int numRows = 3;
        ZTransformer zTransformer = new ZTransformer();
        String result = "LCIRETOESIIGEDHN";
        Assert.assertEquals(result,zTransformer.convert(s,numRows));
    }
}