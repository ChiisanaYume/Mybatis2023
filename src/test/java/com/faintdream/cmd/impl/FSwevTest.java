package com.faintdream.cmd.impl;

import com.faintdream.cmd.Swev;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class FSwevTest {
    @Test
    public void setTest() throws IOException {
        // Test code

        Swev swev= new FSwev();
        boolean res1 = swev.set("Amber","Energetic and lively little girl");
        boolean res2 = swev.set("Test_2023_05","2023-05-23");
        boolean res3 = swev.set("KLee","The world's most adorable",swev.SYSTEM_VARIABLE);
        boolean res4 = swev.set("KLee","The world's most adorable",swev.SYSTEM_VARIABLE);
        boolean res5 = swev.set("FD_Test","D:\\app\\",swev.USER_VARIABLE);

        Assert.assertTrue(res1);
        Assert.assertTrue(res2);
        Assert.assertTrue(res3);
        Assert.assertTrue(res4);
        Assert.assertTrue(res5);
        Assert.assertEquals(swev.USER_VARIABLE,FSwev.getVarDefaultType());

        List<String>  pis = ((FSwev)swev).getProcessOutputStreams();
        for(String s : pis){
            System.out.println(s);
        }
    }
}
