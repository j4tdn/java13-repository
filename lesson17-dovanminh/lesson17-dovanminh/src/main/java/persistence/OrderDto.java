package persistence;

import java.time.LocalTime;

public class OrderDto {
	private int maMH;
	private String tenMH;
	private LocalTime orderTime;
	public OrderDto() {
		
	}
	public OrderDto(int maMH, String tenMH, LocalTime orderTime) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.orderTime = orderTime;
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public LocalTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}
	@Override
	public String toString() {
		return "OrderDto [maMH=" + maMH + ", tenMH=" + tenMH + ", orderTime=" + orderTime + "]";
	}
	
}
