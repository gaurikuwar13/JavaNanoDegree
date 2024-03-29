package com.example.springbootwebsocket.config;

import com.example.springbootwebsocket.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

public class SchedulerConfig {
    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void sendAdhocMessage() {
        template.convertAndSend("/topic/user",new UserResponse("Scheduler"));
    }
}
