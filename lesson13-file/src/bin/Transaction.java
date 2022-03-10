package bin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Transaction {
	private int id;
	private String Tradername;
	private double value;
	private LocalDate date;
	
	public Transaction() {
	}

	public Transaction(int id, String tradername, double value, LocalDate date) {
		super();
		this.id = id;
		Tradername = tradername;
		this.value = value;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTradername() {
		return Tradername;
	}

	public void setTradername(String tradername) {
		Tradername = tradername;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", Tradername=" + Tradername + ", value=" + value + ", date=" + date + "]";
	}
	
	public static Transaction transfer(String line) {
		Transaction transaction = null;
		String[] elements = line.split("[,\\s]+");
		if (elements.length == 4) {
			transaction = new Transaction(Integer.parseInt(elements[0]), 
					elements[1], Double.parseDouble(elements[2]),
					LocalDate.parse(elements[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")));
		}
		return transaction;
	}
}
