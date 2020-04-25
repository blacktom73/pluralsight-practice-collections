package main.java.hu.mitro;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class PriorityPostOffice extends PostOffice {

	public PriorityPostOffice() {
		deliveryQueue = new PriorityQueue<>();
		deliveriesSent = new ArrayList<>();
	}

	@Override
	public void addDelivery(Delivery delivery) {
		deliveryQueue.offer(delivery);
	}

	@Override
	public void postDeliveryByType(DeliveryType deliveryType) {
		for (Delivery delivery : deliveryQueue) {
			if (delivery.getDeliveryType().equals(deliveryType)) {
				Delivery deliveryToSend = deliveryQueue.remove();
				deliveriesSent.add(deliveryToSend);
			}
		}
	}

	public void postHighestPriorityDelivery() {
		Delivery delivery = deliveryQueue.poll();
		delivery.setSent();
		deliveriesSent.add(delivery);
		System.out.println(delivery.getDeliveryType() + " was sent.");
	}
}
