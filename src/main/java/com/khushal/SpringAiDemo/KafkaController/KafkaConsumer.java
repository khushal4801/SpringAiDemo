package com.khushal.SpringAiDemo.KafkaController;

import com.khushal.SpringAiDemo.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic-name", groupId = "my-group-id")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }

    @KafkaListener(topics = "my-topic-name", groupId = "my-group-new")
    public void ConsumeNew(RiderLocation riderLocation) {
        System.out.println("Received location: " + riderLocation.getRiderId() + ", Location " + riderLocation.getLatitude() + ", : " + riderLocation.getLongitude());
    }

}
