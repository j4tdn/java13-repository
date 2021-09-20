package bean;

public class Vehicle {
	private String chuxe;
	private String dongxe;
	private Long dungtich;
	private Long giatri;
	private Long thue;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String chuxe, String dongxe, Long dungtich, Long giatri) {
		this.chuxe = chuxe;
		this.dongxe = dongxe;
		this.dungtich = dungtich;
		this.giatri = giatri;
	}

	public String getChuxe() {
		return chuxe;
	}

	public void setChuxe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getDongxe() {
		return dongxe;
	}

	public void setDongxe(String dongxe) {
		this.dongxe = dongxe;
	}

	public Long getDungtich() {
		return dungtich;
	}

	public void setDungtich(Long dungtich) {
		this.dungtich = dungtich;
	}

	public Long getGiatri() {
		return giatri;
	}

	public void setGiatri(Long giatri) {
		this.giatri = giatri;
	}

	public void setThue() {

		if (this.dungtich <100) {
			 this.thue = this.giatri * 1 / 100;
		}
		if (this.dungtich >=100 && this.dungtich <=200) {
			 this.thue = this.giatri * 3 / 100;
		}
		if (this.dungtich >200) {
			 this.thue = this.giatri * 5 / 100;
		}
	}

		public Long getThue() {
		return thue;
	}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(this == obj) {
				return true;
			}
			if(!(obj instanceof Vehicle)) {
				return false;
			}
			Vehicle that = (Vehicle)obj;
			 return getChuxe() == null? false: getChuxe().equals(that.getChuxe()) &&
				    getDongxe() == null? false: getDongxe().equals(that.getDongxe()) &&
				    getGiatri() == null? false: getGiatri().equals(that.getGiatri()) &&
				    getDungtich() == null? false: getDungtich().equals(that.getDungtich());
			 
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return chuxe + "			" + dongxe + "			" + dungtich + "			" + giatri + "			" + thue;
		}

}
