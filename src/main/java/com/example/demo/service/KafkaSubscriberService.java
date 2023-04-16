package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class KafkaSubscriberService {

    @KafkaListener(topics = "any-topic", groupId = "app")
    public void receiver(String message) {
        log.info("message received  -> " + message);
    }
}
