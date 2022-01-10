package Ex03;

import java.util.Objects;

public class Card {
	 private String type;
	    private String order;

	    public Card() {

	    }

	    public Card(String type, String order) {
	        this.type = type;
	        this.order = order;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getOrder() {
	        return order;
	    }

	    public void setOrder(String order) {
	        this.order = order;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(type, order);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || !(obj instanceof Card)) {
	            return false;
	        }
	        Card that = (Card) obj;
	        return that.getType().equals(getType()) && that.getOrder().equals(getOrder());
	    }

	    @Override
	    public String toString() {
	        return type + ", " + order;
	    }
}


