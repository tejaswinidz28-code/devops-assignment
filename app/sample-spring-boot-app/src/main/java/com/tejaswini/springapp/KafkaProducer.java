package com.tejaswini.springapp;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish/{msg}")
    public String publish(@PathVariable String msg){
        kafkaTemplate.send("spring-topic", msg);
        return "Message sent to Kafka";
    }
}
