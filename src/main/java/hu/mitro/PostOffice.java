package main.java.hu.mitro;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class PostOffice {

	private Queue<Delivery> deliveryQueue;
	private List<Delivery> deliveriesSent;

	public PostOffice() {
		deliveryQueue = new PriorityQueue<>();
		deliveriesSent = new ArrayList<>();
	}

	public void addDelivery(Delivery delivery) {
		deliveryQueue.offer(delivery);
	}


	public void postDelivery(DeliveryType deliveryType) {

	}


	public void postHighestPriority() {
		Delivery delivery = deliveryQueue.poll();
		delivery.setSent();
		deliveriesSent.add(delivery);
	}

	public void showQueue() {
		System.out.println("Queue content:\n" + deliveryQueue);
	}

	public void showDeliveriesSent() {
		System.out.println("Sent deliveries:\n" + deliveriesSent);
	}

	public int getQueueSize(){
		return deliveryQueue.size();
	}
}
