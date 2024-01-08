package com.shakir.kafkademo.Controller;

import com.shakir.kafkademo.Kakfa.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class ProducerController {

    private KafkaProducer kafkaProducer;

    public ProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(){
        kafkaProducer.sendMessage("hello");
        return ResponseEntity.ok("Message sent");
    }
}
