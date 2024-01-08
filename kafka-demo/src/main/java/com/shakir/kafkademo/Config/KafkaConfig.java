package com.shakir.kafkademo.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic nameStrings(){
        return TopicBuilder.name("nameStrings").build();
    }

    @Bean
    public NewTopic jsonObjects(){
        return TopicBuilder.name("json_Obj").build();
    }
}
