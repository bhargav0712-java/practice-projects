package com.practice.demo.controller;

import com.practice.demo.entity.EventRegistration;
import com.practice.demo.service.EventRegistrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventRegistrationController {

    private final EventRegistrationService eventRegistrationService;

    public EventRegistrationController(EventRegistrationService eventRegistrationController) {
        this.eventRegistrationService = eventRegistrationController;
    }

    @PostMapping
    public EventRegistration createEvent(@RequestBody EventRegistration eventRegistration){
        return eventRegistrationService.createEvent(eventRegistration);
    }

    @GetMapping("/{id}")
    public EventRegistration findEventById(@PathVariable Long id){
        return eventRegistrationService.getEventById(id);
    }

    @GetMapping
    public List<EventRegistration> getAllList(){
         return eventRegistrationService.getAllEvents();

    }


    @DeleteMapping("/{id}")
    public void deleteEvent(Long id){
        eventRegistrationService.delete(id);
    }
}