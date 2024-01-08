package com.shakir.kafkademo.Kakfa;

import com.shakir.kafkademo.Dto.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User user){
        Message<User> message= MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC,"json_Obj").build();
        kafkaTemplate.send(message);
    }
}
