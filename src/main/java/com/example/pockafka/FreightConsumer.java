package com.example.pockafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FreightConsumer {
    @KafkaListener(topics = "freight", groupId = "teste")
    void consume (String freight){
        System.out.println("Consumed: " + freight);
    }
}
