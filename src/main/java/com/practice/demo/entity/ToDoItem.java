package com.practice.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb010_todo_list")
@Data
public class ToDoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private String dueDate;

    @Column(name = "completed")
    private Boolean completed;


}
