package bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
	
	private Integer id;
	private String traderName;
	private double value;
	private LocalDate date;
	
	public Transaction() {
		
	}

	public Transaction(Integer id, String traderName, double value, LocalDate date) {
		super();
		this.id = id;
		this.traderName = traderName;
		this.value = value;
		this.date = date;
	}
	
	public Transaction(String line) {
		String[] elements = line.split("[,\\s]+");
		if (elements.length == 4) {
			this.id = Integer.parseInt(elements[0]);
			this.traderName = elements[1];
			this.value = Double.parseDouble(elements[2]);
			this.date = LocalDate.parse(elements[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		}
	}

	public static Transaction transfer(String line) {
		// 1, Henry, 1500, 03.04.2022
		String[] elements = line.split("[,\\s]+");
		if (elements.length != 4) {
			return null;
		}
		return new Transaction(
				Integer.parseInt(elements[0]), 
				elements[1], Double.parseDouble(elements[2]),
				LocalDate.parse(elements[3], 
				DateTimeFormatter.ofPattern("dd.MM.yyyy")));
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTraderName() {
		return traderName;
	}

	public void setTraderName(String traderName) {
		this.traderName = traderName;
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
		return "Transaction [id=" + id + ", traderName=" + traderName + ", value=" + value + ", date=" + date + "]";
	}
	
	
}
