package com.example.javaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

    private static final String TOPIC = "guilletopic";

    public void sendMessage(String message){
        ListenableFuture<SendResult<String, String>> future =  kafkaTemplate.send(TOPIC,message);
    }
}
