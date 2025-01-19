package com.ltimindtree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltimindtree.dto.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
//@Slf4j
public class PaytmConsumerApplication {

	private static Logger logger = LoggerFactory.getLogger(PaytmConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PaytmConsumerApplication.class, args);
	}

	@KafkaListener(topics = "PAYMENT_TOPIC1",groupId = "Payment-consumer-group")
	public void consumerPayment1(PaymentRequest paymentRequest) throws JsonProcessingException {
		//business logic
		logger.info("PaymentConsumer1 cosumed message {}", new ObjectMapper().writeValueAsString(paymentRequest));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC1",groupId = "Payment-consumer-group")
	public void consumerPayment2(PaymentRequest paymentRequest) throws JsonProcessingException {
		//business logic
		logger.info("PaymentConsumer2 cosumed message {}", new ObjectMapper().writeValueAsString(paymentRequest));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC1",groupId = "Payment-consumer-group")
	public void consumerPayment3(PaymentRequest paymentRequest) throws JsonProcessingException {
		//business logic
		logger.info("PaymentConsumer3 cosumed message {}", new ObjectMapper().writeValueAsString(paymentRequest));
	}

	@KafkaListener(topics = "PAYMENT_TOPIC1",groupId = "Payment-consumer-group")
	public void consumerPayment4(PaymentRequest paymentRequest) throws JsonProcessingException {
		//business logic
		logger.info("PaymentConsumer4 cosumed message{}", new ObjectMapper().writeValueAsString(paymentRequest));
	}
//	@KafkaListener(topics = "NewTopic_name",groupId = "Payment-consumer-group")
//	public void readPaymentMsg(String message){
//		log.info("readPaymentMsg : message read from listener {}",message);
//	}
}
