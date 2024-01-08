package com.shakir.kafkademo.Controller;


import com.shakir.kafkademo.Dto.User;
import com.shakir.kafkademo.Kakfa.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/json")
public class JsonProducerController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonProducerController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping
    public ResponseEntity<String> sendJson(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json sent");
    }
}
