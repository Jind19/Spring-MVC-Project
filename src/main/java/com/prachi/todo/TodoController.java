package com.prachi.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        List<Todo> todoList = service.retrieveTodos("in28Minutes");
        model.addAttribute("todos", todoList);
        return "list-todos";
    }


}
