package bean;

public class Vehicle {
	private int capacity;
    private double price;
    private String owner,type;
 
    public Vehicle( int capacity, double price, String owner, String type) {
        this.capacity = capacity;
        this.price = price;
        this.owner = owner;
        this.type= type;
    }
    public Vehicle(){
 
    }
 
    public int getCapacity() {
        return capacity;
    }
 
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public String getOwner() {
        return owner;
    }
 
    public void setOwner(String owner) {
        this.owner = owner;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type =type;
    }
 
    public double taxCal(){
        double tax;
        if(capacity<100) tax=price*0.01;
        else if (capacity >= 100 && capacity<=200) tax = price * 0.03;
        else tax = price * 0.05;
        return tax;
    }
 
    @Override
    public String toString() {
        return owner + "-"+type + "-"+price + "-"+capacity;
}
 
    public void printTax(){
        System.out.printf(" %-20s  %-20s  %-20d  %-20f  %-20f\n ",owner,type,capacity,price,taxCal());
    }

}