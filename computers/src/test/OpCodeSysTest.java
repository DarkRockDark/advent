package test;

import main.java.com.kcorkrad.OpCodeSys;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OpCodeSysTest {

    static Integer[] OPCODE_ARRAY_TEST = {
            1,9,10,3,2,3,11,0,99,30,40,50
    };

    static Integer[] OPCODE_ARRAY_RESULT = {
            3500,9,10,70,
            2,3,11,0,
            99,
            30,40,500
    };

    @Test
    public void getResult() {
        OpCodeSys opCodeSys = new OpCodeSys();
        Assert.assertArrayEquals(OPCODE_ARRAY_RESULT, opCodeSys.getResult(OPCODE_ARRAY_TEST));
    }
}