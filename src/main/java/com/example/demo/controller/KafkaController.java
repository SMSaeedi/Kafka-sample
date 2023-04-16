package com.example.demo.controller;

import com.example.demo.service.KafkaSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaSenderService kafkaSenderService;

    @GetMapping("/send")
    public String send() throws ExecutionException, InterruptedException {
        kafkaSenderService.send();
        return "Sent.";
    }

    @GetMapping("/async-send")
    public String asyncSend() {
        kafkaSenderService.asyncSend();
        return "Sent.";
    }

    @GetMapping("/async-send-without-call-back")
    public String asyncSendWithoutCallBack() {
        kafkaSenderService.asyncSendWithoutCallBack();
        return "Sent.";
    }
}
