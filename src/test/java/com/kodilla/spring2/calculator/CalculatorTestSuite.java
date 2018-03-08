package com.kodilla.spring2.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(2.0, 10.0);
        //Then
        Assert.assertEquals(12, result, 0);
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(34.0, 12.5);
        //Then
        Assert.assertEquals(21.5, result, 0);
    }

    @Test
    public void testMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(2.5, 2.5);
        //Then
        Assert.assertEquals(6.25, result, 0);
    }

    @Test
    public void testDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(5.0, 2.0);
        //Then
        Assert.assertEquals(2.5, result, 0);
    }
}
