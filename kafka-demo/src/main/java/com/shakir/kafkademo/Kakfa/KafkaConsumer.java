package com.shakir.kafkademo.Kakfa;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "nameStrings",groupId = "group1")
    public void consume(String message){
        System.out.println(message);
    }
}
