package main.java.hu.mitro;

import java.util.Comparator;


public class Delivery implements Comparable<Delivery> {


	public static Comparator<Delivery> BY_CITY = Comparator.comparing(Delivery::getCity);
	public static Comparator<Delivery> BY_STREET = Comparator.comparing(Delivery::getStreet);
	private DeliveryType deliveryType;
	private String city;
	private String street;
	private boolean isSent;

	public Delivery(DeliveryType deliveryType, String city, String street) {
		this.deliveryType = deliveryType;
		this.city = city;
		this.street = street;
		isSent = false;
	}

	public DeliveryType getDeliveryType() {
		return deliveryType;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public boolean isSent() {
		return isSent;
	}

	public void setSent() {
		isSent = true;
	}

	@Override
	public int compareTo(Delivery o) {
		return (this.getDeliveryType().getPriority() - o.getDeliveryType().getPriority());
	}

	@Override
	public String toString() {
		return "Delivery{" +
				"deliveryType=" + deliveryType +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				", isSent=" + isSent +
				'}';
	}
}
