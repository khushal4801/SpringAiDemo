package com.khushal.SpringAiDemo.KafkaController;

import com.khushal.SpringAiDemo.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaProducer {
    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        RiderLocation riderLocation = new RiderLocation(message, 12.3456, 78.9012);
        // Logic to send the message to Kafka topic
        kafkaTemplate.send("my-topic-name", riderLocation);
        return "Message sent successfully: " + riderLocation.getRiderId();
    }
}
