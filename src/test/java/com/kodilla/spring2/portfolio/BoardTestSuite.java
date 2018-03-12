package com.kodilla.spring2.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAddAndGetToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        BoardConfig config = context.getBean(BoardConfig.class);
        //When
        Board board = config.createBoard();
        String task = board.getToDoList().getTasks().get(0);
        String task1 = board.getToDoList().getTasks().get(1);
        String task2 = board.getToDoList().getTasks().get(2);
        //Then
        Assert.assertEquals("First task to do", task);
        Assert.assertEquals("Second task to do", task1);
        Assert.assertEquals("Third task to do", task2);
    }

    @Test
    public void testTaskAddAndGetInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        BoardConfig config = context.getBean(BoardConfig.class);
        //When
        Board board = config.createBoard();
        String task = board.getInProgressList().getTasks().get(0);
        String task1 = board.getInProgressList().getTasks().get(1);
        String task2 = board.getInProgressList().getTasks().get(2);
        //Then
        Assert.assertEquals(task, "First task in progress");
        Assert.assertEquals(task1, "Second task in progress");
        Assert.assertEquals(task2, "Third task in progress");
    }

    @Test
    public void testTaskAddAndGetDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        BoardConfig boardConfig = context.getBean(BoardConfig.class);
        //When
        Board board = boardConfig.createBoard();
        String task = board.getDoneList().getTasks().get(0);
        String task1 = board.getDoneList().getTasks().get(1);
        String task2 = board.getDoneList().getTasks().get(2);
        //Then
        Assert.assertEquals(task, "First task done");
        Assert.assertEquals(task1, "Second task done");
        Assert.assertEquals(task2, "Third task done");
    }
}

