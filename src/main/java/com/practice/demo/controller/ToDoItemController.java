package com.practice.demo.controller;

import com.practice.demo.entity.ToDoItem;
import com.practice.demo.service.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TODO")
public class ToDoItemController {
    private ToDoItemService toDoItemController;

   @Autowired
    public ToDoItemController(ToDoItemService toDoItemController){
        this.toDoItemController= toDoItemController;
    }
    @GetMapping("/list")
    public List<ToDoItem> ListAll(){
        return  toDoItemController.showAll();
    }
    @PostMapping
    public ToDoItem create(@RequestBody ToDoItem toDoItem){
        return toDoItemController.createNew(toDoItem);
    }
    @PutMapping("/{id}")
    public ToDoItem updateExisting(@PathVariable Long id, @RequestBody ToDoItem toDoItem){
        return toDoItemController.updateExisting(id, toDoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id){
        toDoItemController.deleteList(id);
    }

}
