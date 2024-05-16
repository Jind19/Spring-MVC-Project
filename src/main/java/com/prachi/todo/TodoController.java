package com.prachi.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodoList(ModelMap model, HttpServletRequest request) {
        String name = (String) request.getSession().getAttribute("name");
        model.addAttribute("todos", service.retrieveTodos(name));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.GET)
    public String showTodoPage() {
        return "todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @RequestParam String desc, HttpServletRequest request) {
        String name = (String) request.getSession().getAttribute("name");
        service.addTodo(name, desc, new Date(), false  );
        return "redirect:list-todos";
    }

    @RequestMapping(value = "/delete-todos", method = RequestMethod.GET)
    public String showDeletePage(){
        return "delete";
    }

    @RequestMapping(value = "/delete-todos", method = RequestMethod.POST)
    public String deleteTodoforController(@RequestParam int id){
        service.deleteTodo(id);
        return "redirect:list-todos";
    }
}
