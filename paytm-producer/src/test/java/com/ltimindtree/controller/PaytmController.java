package com.ltimindtree.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltimindtree.dto.PaymentRequest;
import com.ltimindtree.dto.PaytmRequest;

import java.util.Date;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import scala.util.Random;

@RestController
public class PaytmController {

    @Value("${paytm.producer.topic.name}")
    public String topicName;

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping("/publish/{message}")
    public void sendMessage(@PathVariable String message){
        for (int i =1;i<=100;i++) {
            kafkaTemplate.send("PAYMENT_TOPIC", message+i);
        }
    }

//    @PostMapping("/paytm/payment")
//    public ResponseEntity<String> doPayment(@RequestBody(required = false) PaytmRequest<PaymentRequest> paytmRequest) {
//        if (paytmRequest == null) {
//            return ResponseEntity.badRequest().body("Invalid request: PaytmRequest is missing");
//        }
//
//        PaymentRequest paymentRequest = paytmRequest.getPayLoad();
//        if (paymentRequest == null) {
//            return ResponseEntity.badRequest().body("Invalid request: PaymentRequest payload is missing");
//        }
//
//        // Set transaction details
//        paymentRequest.setTransactionId(UUID.randomUUID().toString());
//        paymentRequest.setTxDate(new Date());
//
//        // Send to Kafka
//        kafkaTemplate.send(topicName, paytmRequest);
//
//        return ResponseEntity.ok("Payment received successfully...!");
//    }
    @PostMapping("/paytm/payment")
    public String doPayment(@RequestBody PaytmRequest<PaymentRequest> paytmRequest) throws JsonProcessingException {
        for (int i = 0; i <= 500; i++) {
            PaymentRequest paymentRequest = paytmRequest.getPayLoad();
            paymentRequest.setSrcAcc("SRC_AC: "+ i);
            paymentRequest.setDestAcc("DEST_ACC: "+ i);
            paymentRequest.setAmount(new Random().nextInt(10000));
            paymentRequest.setTransactionId(paymentRequest.getTransactionId());
            paymentRequest.setTxDate(new Date());
            kafkaTemplate.send(topicName, new ObjectMapper().writeValueAsString(paymentRequest));
        }
         return "message sent to kafka ";
    }
}
