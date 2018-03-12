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
        //Then
        Assert.assertEquals("First task to do", task);
        TaskList tasks = board.getToDoList();
        tasks.getTasks().stream()
                .forEach(System.out::println);
    }

    @Test
    public void testTaskAddAndGetInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        BoardConfig config = context.getBean(BoardConfig.class);
        //When
        Board board = config.createBoard();
        String task = board.getInProgressList().getTasks().get(1);
        //Then
        Assert.assertEquals(task, "Second task in progress");
        TaskList taskList = board.getInProgressList();
        taskList.getTasks().stream()
                .forEach(System.out::println);
    }

    @Test
    public void testTaskAddAndGetDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        BoardConfig boardConfig = context.getBean(BoardConfig.class);
        //When
        Board board = boardConfig.createBoard();
        String task = board.getDoneList().getTasks().get(2);
        //Then
        Assert.assertEquals(task, "Third task done");
        TaskList taskList = board.getDoneList();
        taskList.getTasks().stream()
                .forEach(System.out::println);
    }
}

