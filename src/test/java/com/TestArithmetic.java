package com;

import org.junit.Assert;
import org.junit.Test;

public class TestArithmetic  {
    @Test
    public void addTest(){
        Arithmetic a=new Arithmetic();
        double calc= a.add(6,4);
        if(calc !=10) Assert.fail();
    }
    @Test
    public void minusTest(){
        Arithmetic a=new Arithmetic();
        double calc= a.minus(6,4);
        if(calc !=2) Assert.fail();
    }
    @Test
    public void multTest(){
        Arithmetic a=new Arithmetic();
        double calc= a.mult(6,4);
        if(calc !=24) Assert.fail();
    }
    @Test
    public void divTest(){
        Arithmetic a=new Arithmetic();
        double calc= a.div(6,2);
        Assert.assertTrue(calc ==3);
    }

}
