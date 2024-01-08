package com.shakir.kafkademo.Kakfa;

import com.shakir.kafkademo.Dto.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "json_Obj",groupId = "group1")
    public void consume(User user){
        System.out.println(user);
    }
}
