package com.kodilla.spring2.portfolio;

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
        //Then
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
        //Then
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
        //Then
        TaskList taskList = board.getDoneList();
        taskList.getTasks().stream()
                .forEach(System.out::println);
    }
}

