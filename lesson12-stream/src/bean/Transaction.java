package bean;

public class Transaction {
	
	// OOP --> Item -> Store        ===> HAS-A
	// OOP --> Table extends Device ===> IS-A
	
	// Item: itemId(Integer), qty(Long), brand(String),
	//       store(Store), warehouse(Warehouse), country(Country)
	
	// Store: storeId(Integer), warehouse(Warehouse), items(List<Item>)
	
	private final Trader trader;
	private final int year;
	private final int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return this.trader;
	}

	public int getYear() {
		return this.year;
	}

	public int getValue() {
		return this.value;
	}

	public String toString() {
		return "{" + this.trader + ", " +
				"year: " + this.year + ", " +
				"value:" + this.value + "}";
	}
}
