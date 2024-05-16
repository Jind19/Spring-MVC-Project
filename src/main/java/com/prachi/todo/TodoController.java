package com.prachi.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodoList(ModelMap model) {
        String name = (String) model.get("name");
        model.addAttribute("todos", service.retrieveTodos(name));
        return "list-todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.GET)
    public String showTodoPage(ModelMap model) {
        model.addAttribute("todo", new Todo(0, "in28Minutes", "Default Description", new Date(), false ));
        return "todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.POST)
    public String addTodo(ModelMap model, Todo todo) {
        String name = (String) model.get("name");
        service.addTodo(name, todo.getDesc(), new Date(), false);
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

    @RequestMapping(value = "/delete-todos-here", method = RequestMethod.GET)
    public String deleteHere(@RequestParam int id){
            service.deleteTodo(id);
            return "redirect:list-todos";
    }
}
