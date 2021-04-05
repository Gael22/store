package com.store.messaging;

import java.util.Queue;

import javax.jms.Destination;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.store.pojo.Item;

@Service
public class JmsMessageSender {

	private JmsTemplate jmsTemplate;
	
	private Queue queue;
	
	private Topic topic;
	
	private Queue StoreInventoryQueue;
	
	@Autowired
	@Qualifier("destinationQueue")
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	@Autowired
	public void setQueue(Queue queue) {
		this.queue = queue;
	}
	
	@Autowired 
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Autowired
	public void setStoreInventoryQueue(Queue storeInventoryQueue) {
		StoreInventoryQueue = storeInventoryQueue;
	}
	
	public void simpleSend(String msg) {
		jmsTemplate.send(topic, (s) -> s.createTextMessage(msg));
	}
	
	public void sendToQueue (String msg) {
		jmsTemplate.send((Destination) queue, (s) -> s.createTextMessage(msg));
	}
	
    public void sendToInventoryQueue(Item item, int quantity) {
		
//		ItemInventory ii = new ItemInventory(item, quantity);
//		
//		jmsTemplate.send(inventoryQueue, (s) -> s.createObjectMessage(ii));
//	}
		
	
  }
}
