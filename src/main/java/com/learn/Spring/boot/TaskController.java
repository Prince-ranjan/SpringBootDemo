package com.learn.Spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/demoforget")
    public String createMappingDemo() {
        return "Hello this is a get request from the user";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Riya and Thomas ...";
    }

    @PostMapping("/create")
    public Task cratetask(@RequestBody Task task) {
        return taskService.createTask(task);
    }


    @GetMapping("/alltask")
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }
}

/*

.
GET
POST
PUT
FETCH
PATCh


 */
