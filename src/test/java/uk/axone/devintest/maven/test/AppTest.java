package uk.axone.devintest.maven.test;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running test 3");
    }

    @Test
    public void test4(){
        System.out.println("Running test 4");
        Assert.fail();
    }

}
