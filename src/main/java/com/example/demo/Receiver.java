package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 
 * 消息接受者
 * 
 * @author admin
 *
 */
@Component
public class Receiver {

	
	@Autowired
	private AmqpTemplate  amqpTemplate; 
	/**
	 * 
	 */
	@RabbitListener(queues= {"FirstQueue"})
	public void process(String msg) {
		
		System.out.println("Receiver:" + msg);
	}
	
}
