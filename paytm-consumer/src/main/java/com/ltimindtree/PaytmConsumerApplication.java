package com.ltimindtree;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
//@Slf4j
public class PaytmConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmConsumerApplication.class, args);
	}

	@KafkaListener(topics = "madhavJava",groupId = "Payment-consumer-group")
	public void consumerPayment(String message){
		System.out.println(("consumerpayment : messages are consumed by message {}"+message));
	}

//	@KafkaListener(topics = "NewTopic_name",groupId = "Payment-consumer-group")
//	public void readPaymentMsg(String message){
//		log.info("readPaymentMsg : message read from listener {}",message);
//	}
}
