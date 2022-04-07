package demo;

import builder.User;
import builder.Warehouse;
import factory.Shape;
import factory.ShapeFactory;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		/**
		 * Builder Pattern
		 */
		User user = User.builder().firstName("Tran").lastName("Viet").age(21).address("37 Chon Tam 8").phone("0935169835").build();
		System.out.println(user);

		Warehouse warehouse = new Warehouse().address("Da Nang").minItems(10).maxItems(100).manager("A");
		System.out.println(warehouse);
	}
}
