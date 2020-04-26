package main.java.hu.mitro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		System.out.printf("Sending all of remained " + deliveryType + "...\n");
		List<Delivery> remainedDeliveries = new ArrayList<>(deliveryQueue);
		for (int i = 0; i < remainedDeliveries.size(); i++) {
			if (remainedDeliveries.get(i).getDeliveryType().equals(deliveryType)) {
				Delivery deliveryToSend = remainedDeliveries.remove(i);
				deliveryToSend.setSent();
				deliveriesSent.add(deliveryToSend);
			}
		}
		deliveryQueue = new LinkedList<>(remainedDeliveries);
	}

	public void postHighestPriorityDelivery() {
		Delivery delivery = deliveryQueue.poll();
		delivery.setSent();
		deliveriesSent.add(delivery);
		System.out.println(delivery.getDeliveryType() + " was sent.");
	}
}
