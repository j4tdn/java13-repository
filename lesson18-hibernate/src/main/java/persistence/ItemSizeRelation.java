package persistence;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Role: Entity Mapping with table ChiTietMatHang
 * 
 * In case table N-N has no extra columns --> using @ManyToMany and @JoinTable
 * 
 * Else --> Create another entity for N-N table
 * 
 */

@Entity
@Table(name = "ChiTietMatHang")
public class ItemSizeRelation {

	@EmbeddedId
	private Id id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	private Item item;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKC", referencedColumnName = "MaKC", insertable = false, updatable = false)
	private Size size;

	@Column(name = "HinhAnh")
	private String image;

	@Column(name = "GiaBan")
	private Double salesPrice;

	@Column(name = "GiaMua")
	private Double buyPrice;

	@Column(name = "SoLuong")
	private Double amount;
	
	public ItemSizeRelation() {
	}

	public ItemSizeRelation(Id id, String image, Double salesPrice, Double buyPrice, Double amount) {
		this.id = id;
		this.image = image;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.amount = amount;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ItemSizeRelation [id=" + id + ", image=" + image + ", salesPrice=" + salesPrice + ", buyPrice="
				+ buyPrice + ", amount=" + amount + "]";
	}

	// Nested class
	@Embeddable
	public static class Id implements Serializable{

		private static final long serialVersionUID = -1381536532347613215L;

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "MaKC")
		private String sizeId;

		public Id() {
		}

		public Id(Integer itemId, String sizeId) {
			this.itemId = itemId;
			this.sizeId = sizeId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public String getSizeId() {
			return sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Id)) return false;
			final Id that = (Id)o;
			return getItemId() == that.getItemId() && getSizeId() == that.getSizeId();
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(getItemId(), getSizeId());
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}
	}

}
