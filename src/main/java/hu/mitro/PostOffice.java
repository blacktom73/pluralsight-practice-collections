package main.java.hu.mitro;

import java.util.List;
import java.util.Queue;


public abstract class PostOffice {

	protected Queue<Delivery> deliveryQueue;
	protected List<Delivery> deliveriesSent;

	public abstract void addDelivery(Delivery delivery);

	public abstract void postDeliveryByType(DeliveryType deliveryType);

	public void showDeliveries() {
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Deliveries at the post office:");
		for (Delivery delivery : deliveryQueue) {
			System.out.println(delivery.getDeliveryType());
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}

	public void showDeliveriesSent() {
		System.out.println("Sent deliveries:\n" + deliveriesSent);
	}

	public int getNumberOfDeliveries() {
		return deliveryQueue.size();
	}

	public int getNumberOfDeliveriesSent() {
		return deliveriesSent.size();
	}
}
