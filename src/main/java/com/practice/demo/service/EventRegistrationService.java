package com.practice.demo.service;

import com.practice.demo.entity.EventRegistration;
import com.practice.demo.repo.EventRegistrationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRegistrationService {

    private final EventRegistrationRepo eventRegistrationRepo;

    public EventRegistrationService(EventRegistrationRepo eventRegistrationRepo) {
        this.eventRegistrationRepo = eventRegistrationRepo;
    }

    public EventRegistration createEvent(EventRegistration eventRegistration){
        return eventRegistrationRepo.save(eventRegistration);
    }

    public EventRegistration getEventById(Long id){
        return eventRegistrationRepo.findById(id).orElse(null);
    }
    public List<EventRegistration> getAllEvents(){
            return eventRegistrationRepo.findAll();
    }

    public void delete(Long id){
        eventRegistrationRepo.deleteById(id);
    }
}
