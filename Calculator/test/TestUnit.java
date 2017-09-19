/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import calculator.Arithmetic;

import static org.junit.Assert.*;

/**
 *
 * @author Joseph
 */
public class TestUnit {
    
    public TestUnit() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void Arithmetic()
    {
        final Arithmetic ac = Arithmetic.getCalculation();
        Assert.assertEquals("Addition", 2.0, ac.getCalculation(1,1,1), 0);
        Assert.assertEquals("Subtraction",0, ac.getCalculation(1,2,1), 0);
        Assert.assertEquals("Multiplication", 15.0, ac.getCalculation(3,3,5), 0);
        Assert.assertEquals("Division",3.0, ac.getCalculation(6,4,2), 0);
        Assert.assertEquals("Pow Positive",125.0, ac.getCalculation(5,5,3), 0);
        Assert.assertEquals("Pow positive negative",1/125.0, ac.getCalculation(5,5,-3), 0);
        Assert.assertEquals("Pow Negative Positive", -125.0, ac.getCalculation(-5,5,3), 0);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

}
