package persistence;

public class ItemDetailDto {
	private Integer idg;
	private String nameg;
	private Integer idi;
	private String namei;
	private Double saleout;
	private Double pricein;
	private Integer number;
	public ItemDetailDto(Integer idg, String nameg, Integer idi, String namei, Double saleout, Double pricein,
			Integer number) {
		super();
		this.idg = idg;
		this.nameg = nameg;
		this.idi = idi;
		this.namei = namei;
		this.saleout = saleout;
		this.pricein = pricein;
		this.number = number;
	}
	
	public ItemDetailDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdg() {
		return idg;
	}

	public void setIdg(Integer idg) {
		this.idg = idg;
	}

	public String getNameg() {
		return nameg;
	}

	public void setNameg(String nameg) {
		this.nameg = nameg;
	}

	public Integer getIdi() {
		return idi;
	}

	public void setIdi(Integer idi) {
		this.idi = idi;
	}

	public String getNamei() {
		return namei;
	}

	public void setNamei(String namei) {
		this.namei = namei;
	}

	public Double getSaleout() {
		return saleout;
	}

	public void setSaleout(Double saleout) {
		this.saleout = saleout;
	}

	public Double getPricein() {
		return pricein;
	}

	public void setPricein(Double pricein) {
		this.pricein = pricein;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ItemDetail [idg=" + idg + ", nameg=" + nameg + ", idi=" + idi + ", namei=" + namei + ", saleout="
				+ saleout + ", pricein=" + pricein + ", number=" + number + "]";
	}
	
	
}
