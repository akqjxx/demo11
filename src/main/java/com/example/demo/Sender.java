package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 * 
 * @author admin
 *
 */

@Component
public class Sender {
	 
	
	@Autowired
	private AmqpTemplate  amqpTemplate; 

	/**
	 * 发送消息
	 */
	public void send(String msg) {
		
		amqpTemplate.convertAndSend("FirstQueue", msg);
	}

}
