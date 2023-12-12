package com.practice.demo.service;

import com.practice.demo.entity.ToDoItem;
import com.practice.demo.repo.ToDoItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemService {
    private ToDoItemRepo toDoItemService;

    @Autowired
    public ToDoItemService (ToDoItemRepo toDoItemService){
        this.toDoItemService = toDoItemService;
    }

    public List<ToDoItem> showAll(){
        return toDoItemService.findAll();
    }
    public ToDoItem createNew(ToDoItem toDoItem){
        return toDoItemService.save(toDoItem);
    }
    public ToDoItem updateExisting(Long id , ToDoItem toDoItem){
       if(toDoItemService.existsById(id)){
           toDoItem.setId(id);
           return toDoItemService.save(toDoItem);
       }
       return null;
    }
    public void deleteList(Long id){
        toDoItemService.deleteById(id);
    }

}
