package main.java.hu.mitro;

public class Main {

	public static void main(String[] args) {
		PriorityPostOffice postOffice = new PriorityPostOffice();
		Delivery mail = new Delivery(DeliveryType.LETTER, "Budapest", "Közvágó u. 2.");
		Delivery mail2 = new Delivery(DeliveryType.LETTER, "Kaposvár", "Munkácsi u. 2.");
		Delivery mail3 = new Delivery(DeliveryType.LETTER, "Győr", "Szabadság u. 2.");
		Delivery prioMail = new Delivery(DeliveryType.PRIORITY_LETTER, "Pécs", "Felső u. 25.");
		Delivery pack = new Delivery(DeliveryType.PACKAGE, "Budapest", "Bajcsy-Zs u. 120.");
		Delivery prioPack = new Delivery(DeliveryType.PRIORITY_PACKAGE, "Budaörs", "Rákóczi u. 45.");
		Delivery moneyTrans = new Delivery(DeliveryType.MONEY_TRANSFER, "Miskolc", "Petőfi u. 29.");
		Delivery prioMoneyTrans = new Delivery(DeliveryType.PRIORITY_MONEY_TRANSFER, "Budapest", "Vörösmarty tér 15.");

		fillQueue(postOffice, mail);
		fillQueue(postOffice, mail2);
		fillQueue(postOffice, mail3);
		fillQueue(postOffice, prioMail);
		fillQueue(postOffice, pack);
		fillQueue(postOffice, prioPack);
		fillQueue(postOffice, moneyTrans);
		fillQueue(postOffice, prioMoneyTrans);
		postOffice.showDeliveries();

		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);

		postOffice.postDeliveryByType(DeliveryType.LETTER);
		postOffice.showDeliveries();

	}

	private static void fillQueue(PriorityPostOffice postOffice, Delivery delivery) {
		System.out.println("Filling the queue with deliveries ...");
		postOffice.addDelivery(delivery);
		System.out.println("Number of deliveries: " + postOffice.getNumberOfDeliveries());
	}

	private static void postHighestPriorityDelivery(PriorityPostOffice postOffice) {
		System.out.println("Posting the highest priority delivery ...");
		postOffice.postHighestPriorityDelivery();
		System.out.println("Number of deliveries: " + postOffice.getNumberOfDeliveries());
		postOffice.showDeliveries();
		System.out.println("Number of deliveries were sent: " + postOffice.getNumberOfDeliveriesSent());
		postOffice.showDeliveriesSent();
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}
