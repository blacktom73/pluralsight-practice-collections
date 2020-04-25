package main.java.hu.mitro;

public enum DeliveryType {

	LETTER("LETTER", 100000),
	PRIORITY_LETTER("PRIORITY-LETTER", 100),
	PACKAGE("PACKAGE", 10000),
	PRIORITY_PACKAGE("PRIORITY-PACKAGE", 10),
	MONEY_TRANSFER("MONEY-TRANSFER", 1000),
	PRIORITY_MONEY_TRANSFER("PRIORITY-MONEY-TRANSFER", 1);

	private String label;
	private int priority;

	DeliveryType(String label, int priority) {
		this.label = label;
		this.priority = priority;
	}

	public String getLabel() {
		return label;
	}

	public int getPriority() {
		return priority;
	}
}
