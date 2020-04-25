package main.java.hu.mitro;

public class Main {

	public static void main(String[] args) {
		PostOffice postOffice = new PostOffice();
		Delivery mail = new Delivery(DeliveryType.LETTER, "Budapest", "Közvágó u. 2.");
		Delivery prioMail = new Delivery(DeliveryType.PRIORITY_LETTER, "Pécs", "Felső u. 25.");
		Delivery pack = new Delivery(DeliveryType.PACKAGE, "Budapest", "Bajcsy-Zs u. 120.");
		Delivery prioPack = new Delivery(DeliveryType.PRIORITY_PACKAGE, "Budaörs", "Rákóczi u. 45.");
		Delivery moneyTrans = new Delivery(DeliveryType.MONEY_TRANSFER, "Miskolc", "Petőfi u. 29.");
		Delivery prioMoneyTrans = new Delivery(DeliveryType.PRIORITY_MONEY_TRANSFER, "Budapest", "Vörösmarty tér 15.");

		fillQueue(postOffice, mail, prioMail, pack, prioPack, moneyTrans, prioMoneyTrans);

		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
		postHighestPriorityDelivery(postOffice);
	}

	private static void fillQueue(PostOffice postOffice, Delivery mail, Delivery prioMail, Delivery pack, Delivery prioPack,
			Delivery moneyTrans, Delivery prioMoneyTrans) {
		System.out.println("Filling in the queue with deliveries ...");
		postOffice.addDelivery(mail);
		postOffice.addDelivery(prioMail);
		postOffice.addDelivery(pack);
		postOffice.addDelivery(prioPack);
		postOffice.addDelivery(moneyTrans);
		postOffice.addDelivery(prioMoneyTrans);
		System.out.println("Queue size: " + postOffice.getQueueSize());
		postOffice.showQueue();
		System.out.println("============================================================================================================");
	}

	private static void postHighestPriorityDelivery(PostOffice postOffice) {
		System.out.println("Posting the highest priority delivery ...");
		postOffice.postHighestPriority();
		System.out.println("Queue size: " + postOffice.getQueueSize());
		postOffice.showQueue();
		postOffice.showDeliveriesSent();
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}
