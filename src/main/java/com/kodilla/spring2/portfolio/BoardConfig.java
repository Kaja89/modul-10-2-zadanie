package com.kodilla.spring2.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList createToDoList() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("First task to do");
        tasks.add("Second task to do");
        tasks.add("Third task to do");
        return new TaskList(tasks);
    }

    @Bean
    public TaskList createInProgressList() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("First task in progress ");
        tasks.add("Second task in progress");
        tasks.add("Third task in progress");
        return new TaskList(tasks);
    }

    @Bean
    public TaskList createDoneList() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("First task done ");
        tasks.add("Second task done");
        tasks.add("Third task done");
        return new TaskList(tasks);
    }

    @Bean
    public Board createBoard() {
        Board board = new Board(createToDoList(), createInProgressList(), createDoneList());
        return board;
    }
}
